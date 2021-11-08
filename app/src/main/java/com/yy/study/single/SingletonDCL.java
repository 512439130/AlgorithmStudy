package com.yy.study.single;

/**
 * DCL单例模式+volatile 保证：资源消耗，多余同步，线程安全
 */
public class SingletonDCL {
    //由于mInstance = new ActivityUtils();编译后的指令为3步
    // 1.memory = allocate(); //1.分配对象内存空间
    // 2.instance(memory);    //2.初始化对象
    // 3.instance = memory;   //3.设置instance指向刚分配的内存地址，此时instance！=null
    // 编译器保证单线程串行语义下，进行指令重排为 132的执行顺序，则会导致 if(mInstance == null)条件错误判断，获取错误的结果

    //***DCL双重判断通过synchronized保证多线程的可见性
    // 当A线程执行完毕，释放锁，B线程获得锁，执行到第二个判断时if(mInstance == null)
    // 由于A线程完成了instance对象创建，由工作线程缓存并主动刷新主内存，并使B其他线程使用的工作线程的缓存失效，其他线程需要主动去主线程重新获取，
    // 此时在主线程中重新获取的instance不为空，则B线程判断为false，直接返回对象）
    //***通过volatile修饰解决JMM指令重排导致的问题: 因为对象创建不是原子操作，所以有指令重排的可能，为了禁止指令重排，需要引入volatile
    private static volatile SingletonDCL mInstance = null;
    //构造函数私有，防止非法new
    private SingletonDCL(){

    }
    public static SingletonDCL getInstance(){
        if(mInstance == null){
            //锁定当前类的对象
            synchronized (SingletonDCL.class){
                if(mInstance == null){
                    mInstance = new SingletonDCL();
                }
            }
        }
        return mInstance;
    }

    public void test(){
        System.out.println(getClass().getSimpleName()+".test()" + "hashcode:" + hashCode());
    }
}

