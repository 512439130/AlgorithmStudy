package com.yy.study.algorithm.source;

import android.util.ArrayMap;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrayTest {
    public static void main(String[] args) {
        //HashSet和HashMap的区别
        //HashMap实现Map接口，存储<key,value>键值对，不允许出现重复key
        //HashSet实现Set接口，存储对象，不允许出现重复值
        //HashSet底层通过HashMap实现存储，HashSet通过HashMap的key进行对象存储，实现无重复值存储，value为默认的Object对象



        //------------HashMap-------------
        //非线程安全
        //数据结构: 数组 + 链表 -> 红黑树
        //优点: 快速查找
        //缺点: 有空间浪费
        //put
        //1.根据key计算对应的hash值
        //2.根据hash值计算对应数组index值
        //3.根据index插入存储的数组
        //3.1 hash值的取值范围: 0 ~ tab.length - 1
        //3.2 hash相同: hash冲突
        //3.3 当hash冲突时，插入链表(next)
        //3.4 当数组某个index的链表长度达到要求后，转换红黑树（hash冲突越少，链表越短，访问速度越快）
        //4.当数组容量达到threshold(阈值)时，数组进行扩容
        //5.装载因子(0.6~0.75)
        //******为了降低hash冲突，造成空间浪费，内存浪费多

        //get
        //1.根据key计算对应的hash值
        //2.根据hash值计算对应数组index值
        //3.根据index取数组数据为value

        //------------HashMap-------------

        //------------SparseArray-------------

        //SparseArray          <int, Object>
        //LongSparseArray      <long, Object>
        //SparseBooleanArray   <int, boolean>
        //SparseIntArray       <int, int>
        //SparseLongArray      <int, long>

        //非线程安全
        //数据结构: //通过2个数组进行数据存储，一个存储key，另一个存储value，避免了对key的自动装箱（int转Integer）

        //优点:
        //1.内存占用更小
        //2.当数据量小的时候同比HashMap没有明显差距，整体性能不会差异超过50%
        //3.有序数据插入效率高（正序）
        //4.相比较HashMap，更节省内存空间典型的时间换空间
        //缺点:
        //1.数据量大时，二分查找、数组拷贝带来的性能会很低


        //内部对数据采取了压缩的方式（稀疏数组）的数据，节省内存空间
        //key只能存储int类型的数据，不能重复
        //key数组，value数组

        //put（将key以升序的方法"紧凑的排列在一起"）
        //1.通过二分查找(有序)计算插入的key数组位置(O(logN))，二分查找的返回值为 -start(左边界)
        //2.if(找到该key的index  binarySearch return >= 0)，直接数组下标赋值覆盖
        //3.else(未找到该key的index  binarySearch return < 0)，通过（~= 非运算符求合适的位置）:
        //3.1 如果key对应位置value = DELETED ，则直接数组下标赋值覆盖 O(1)
        //3.2 通过Arrays.copy调整index尾部的数据后移（可以后移）,然后空出index位置给新元素 O(n)
        //3.3 通过Arrays.copy调整index尾部的数据后移（不能后移）,则执行GC操作，GC删除数组中一些value被DELETE标记的元素，使整个数组尾部有空闲位置，可以向后移动元素，然后放置新元素 O(n)
        //3.4 通过Arrays.copy调整index尾部的数据后移（不能后移）,GC操作也无法向后移动元素，需要数组扩容，插入下标大于数组长度时自动扩容。 O(n)
        //3.5 其中GC操作: 通过o记录数组未标记的数量，最后保存到mSize(数组当前的元素个数)

        //get(O(LogN))
        //1.通过二分查找(有序)寻找value

        //remove -> delete(O(1))
        //1.通过二分查找(有序)寻找value的index
        //2.把index对应的value修改为 DELETED (Object类型)的标识
        //2.1 删除元素并不移动数组，而是重复利用该位置，当前元素index二分查找到值后，则直接数组赋值 mValues[index] = value

        //特有的方法(O(1))
        //keyAt(index) : 通过数组下标查询Key
        //valueAt(index) : 通过数组下标查询Value

        //*****SparseArray 和 LongSparseArray应用场景:
        //***1.数据量不大时，千级以内
        //***2.key必须为int或long类型

        //------------SparseArray-------------



        //------------ArrayMap-------------
        //非线程安全
        //数据结构:
        //内部实现是基于两个数组。
        //一个int[]数组，用于保存每个item的hashCode.
        //一个Object[]数组，保存key/value键值对。容量是上一个数组的两倍。

        //mHash 通过数组升序保存所有key的hashCode
        //mArray存储 key和value
        //查找时通过二分查找对应的index
        //需要优化内存，并且key为非int类型，则使用ArrayMap

        //数组扩容——1.5倍增长
        //内存缓存（复用内存空间），减少new数组开辟新空间
        //只有当容器数量 mSize 为 BASE_SIZE 和 BASE_SIZE*2 时，才进行缓存策略
        //freeArrays: 添加缓存
        //allocArrays: 取缓存

        //put
        //mHashes在index处存储hash code(升序方式:每次插入都以hash值升序排列)
        //mArray存储key和value，通过key计算的hash作为index存储mHashes，mArray中通过mHashes的(index * 2)存储key，通过mHashes的(index*2+1)存储value

        //get
        //index = binarySearch(key)(二分查找)
        //key:(index<<1)
        //value:mArray[(index<<1)+1]

        //remove
        //删除元素时，数组容量会收缩
        //删除元素时，下界控制防止内存抖动
        //------------ArrayMap-------------

        //------------Java装箱和拆箱-------------

        //编码过程中装箱拆箱带来的效率问题值得关注，尽量使用8种基本数据类型（byte,short,int,long,float,double,boolean,char）
        //------------Java装箱和拆箱-------------

        //------------Java原生态类型与泛型类型擦除-------------
        //        List list1 = new ArrayList();
        //        list1.add("1");
        //        list1.add(5);
        //
        //        List<String> list2 = new ArrayList<>();
        //        list2.add("1");
        //        list2.add(5);
        //
        //        List<Object> list3 = new ArrayList<>();
        //------------Java原生态类型与泛型类型擦除-------------

        //非运算符
//        int i = -2;
//        i = ~i;
        // i = 1;  i = -((-2)+1)


        System.out.println("testThrow():" + testThrow());

    }

    public static Map testThrow(){
        Map<String,String> map = new HashMap<>();

        try {
            map.put("test","try");
            System.out.println("map:" + map.toString());
            throw new NullPointerException();
//            return map;
        } catch (Exception e){
            map.put("test","catch");
            System.out.println("map:" + map.toString());
            return map;
        } finally {
            map.put("test","finally");
            System.out.println("map:" + map.toString());
//            throw new NullPointerException();
        }
//        return a;
    }
}
