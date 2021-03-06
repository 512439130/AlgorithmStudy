package com.yy.study.algorithm.leetcode;

import com.yy.study.algorithm.structure.link.ListNode;
import com.yy.study.algorithm.structure.queue.ArrayCircularQueue;
import com.yy.study.algorithm.structure.queue.LinkedCircularQueue;
import com.yy.study.algorithm.structure.queue.MaxQueue;
import com.yy.study.algorithm.structure.tree.TreeNode;
import com.yy.study.util.TimeTestUtils;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class AlgorithmStudy {
    public static void main(String[] args) {
        AlgorithmStudy algorithmStudy = new AlgorithmStudy();
//        int[] num = {1,2,3,3,2,5,7,5,1};
//        System.out.println(singleNumber(num));
//        System.out.println(singleNumber2(num));
//        System.out.println(singleNumber3(num));
//        System.out.println(singleNumber4(num));
//        int[] num = {2, 2, 1, 1, 1, 2, 2};
//        System.out.println(algorithmStudy.majorityElement3(num));

//        int[] num = {2,2};
//        int[] num = {2,1,1,3,1,4,5,6};
//        int[] num = {1,1,1,3,3,2,2,2};
//        System.out.println(algorithmStudy.majorityElement1_3_2(num));

//        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        int[][] matrix = new int[][]{{2,2}};
//        System.out.println(algorithmStudy.searchMatrix2(matrix,21));

//        int[] num1 = new int[]{1,4,5,6,0,0};
//        int[] num2 = new int[]{5,8};
//        algorithmStudy.merge4(num1,4,num2,2);
//        System.out.println("merge-result:" + Arrays.toString(num1));

//        int [] num = new int[]{82597,-9243,62390,83030,-97960,-26521,-61011,83390,-38677,12333,75987,46091,83794,19355,-71037,-6242,-28801,324,1202,-90885,-2989,-95597,-34333,35528,5680,89093,-90606,50360,-29393,-27012,53313,65213,99818,-82405,-41661,-3333,-51952,72135,-1523,26377,74685,96992,92263,15929,5467,-99555,-43348,-41689,-60383,-3990,32165,65265,-72973,-58372,12741,-48568,-46596,72419,-1859,34153,62937,81310,-61823,-96770,-54944,8845,-91184,24208,-29078,31495,65258,14198,85395,70506,-40908,56740,-12228,-40072,32429,93001,68445,-73927,25731,-91859,-24150,10093,-60271,-81683,-18126,51055,48189,-6468,25057,81194,-58628,74042,66158,-14452,-49851,-43667,11092,39189,-17025,-79173,13606,83172,92647,-59741,19343,-26644,-57607,82908,-20655,1637,80060,98994,39331,-31274,-61523,91225,-72953,13211,-75116,-98421,-41571,-69074,99587,39345,42151,-2460,98236,15690,-52507,-95803,-48935,-46492,-45606,-79254,-99851,52533,73486,39948,-7240,71815,-585,-96252,90990,-93815,93340,-71848,58733,-14859,-83082,-75794,-82082,-24871,-15206,91207,-56469,-93618,67131,-8682,75719,87429,-98757,-7535,-24890,-94160,85003,33928,75538,97456,-66424,-60074,-8527,-28697,-22308,2246,-70134,-82319,-10184,87081,-34949,-28645,-47352,-83966,-60418,-15293,-53067,-25921,55172,75064,95859,48049,34311,-86931,-38586,33686,-36714,96922,76713,-22165,-80585,-34503,-44516,39217,-28457,47227,-94036,43457,24626,-87359,26898,-70819,30528,-32397,-69486,84912,-1187,-98986,-32958,4280,-79129,-65604,9344,58964,50584,71128,-55480,24986,15086,-62360,-42977,-49482,-77256,-36895,-74818,20,3063,-49426,28152,-97329,6086,86035,-88743,35241,44249,19927,-10660,89404,24179,-26621,-6511,57745,-28750,96340,-97160,-97822,-49979,52307,79462,94273,-24808,77104,9255,-83057,77655,21361,55956,-9096,48599,-40490,-55107,2689,29608,20497,66834,-34678,23553,-81400,-66630,-96321,-34499,-12957,-20564,25610,-4322,-58462,20801,53700,71527,24669,-54534,57879,-3221,33636,3900,97832,-27688,-98715,5992,24520,-55401,-57613,-69926,57377,-77610,20123,52174,860,60429,-91994,-62403,-6218,-90610,-37263,-15052,62069,-96465,44254,89892,-3406,19121,-41842,-87783,-64125,-56120,73904,-22797,-58118,-4866,5356,75318,46119,21276,-19246,-9241,-97425,57333,-15802,93149,25689,-5532,95716,39209,-87672,-29470,-16324,-15331,27632,-39454,56530,-16000,29853,46475,78242,-46602,83192,-73440,-15816,50964,-36601,89758,38375,-40007,-36675,-94030,67576,46811,-64919,45595,76530,40398,35845,41791,67697,-30439,-82944,63115,33447,-36046,-50122,-34789,43003,-78947,-38763,-89210,32756,-20389,-31358,-90526,-81607,88741,86643,98422,47389,-75189,13091,95993,-15501,94260,-25584,-1483,-67261,-70753,25160,89614,-90620,-48542,83889,-12388,-9642,-37043,-67663,28794,-8801,13621,12241,55379,84290,21692,-95906,-85617,-17341,-63767,80183,-4942,-51478,30997,-13658,8838,17452,-82869,-39897,68449,31964,98158,-49489,62283,-62209,-92792,-59342,55146,-38533,20496,62667,62593,36095,-12470,5453,-50451,74716,-17902,3302,-16760,-71642,-34819,96459,-72860,21638,47342,-69897,-40180,44466,76496,84659,13848,-91600,-90887,-63742,-2156,-84981,-99280,94326,-33854,92029,-50811,98711,-36459,-75555,79110,-88164,-97397,-84217,97457,64387,30513,-53190,-83215,252,2344,-27177,-92945,-89010,82662,-11670,86069,53417,42702,97082,3695,-14530,-46334,17910,77999,28009,-12374,15498,-46941,97088,-35030,95040,92095,-59469,-24761,46491,67357,-66658,37446,-65130,-50416,99197,30925,27308,54122,-44719,12582,-99525,-38446,-69050,-22352,94757,-56062,33684,-40199,-46399,96842,-50881,-22380,-65021,40582,53623,-76034,77018,-97074,-84838,-22953,-74205,79715,-33920,-35794,-91369,73421,-82492,63680,-14915,-33295,37145,76852,-69442,60125,-74166,74308,-1900,-30195,-16267,-60781,-27760,5852,38917,25742,-3765,49097,-63541,98612,-92865,-30248,9612,-8798,53262,95781,-42278,-36529,7252,-27394,-5021,59178,80934,-48480,-75131,-54439,-19145,-48140,98457,-6601,-51616,-89730,78028,32083,-48904,16822,-81153,-8832,48720,-80728,-45133,-86647,-4259,-40453,2590,28613,50523,-4105,-27790,-74579,-17223,63721,33489,-47921,97628,-97691,-14782,-65644,18008,-93651,-71266,80990,-76732,-47104,35368,28632,59818,-86269,-89753,34557,-92230,-5933,-3487,-73557,-13174,-43981,-43630,-55171,30254,-83710,-99583,-13500,71787,5017,-25117,-78586,86941,-3251,-23867,-36315,75973,86272,-45575,77462,-98836,-10859,70168,-32971,-38739,-12761,93410,14014,-30706,-77356,-85965,-62316,63918,-59914,-64088,1591,-10957,38004,15129,-83602,-51791,34381,-89382,-26056,8942,5465,71458,-73805,-87445,-19921,-80784,69150,-34168,28301,-68955,18041,6059,82342,9947,39795,44047,-57313,48569,81936,-2863,-80932,32976,-86454,-84207,33033,32867,9104,-16580,-25727,80157,-70169,53741,86522,84651,68480,84018,61932,7332,-61322,-69663,76370,41206,12326,-34689,17016,82975,-23386,39417,72793,44774,-96259,3213,79952,29265,-61492,-49337,14162,65886,3342,-41622,-62659,-90402,-24751,88511,54739,-21383,-40161,-96610,-24944,-602,-76842,-21856,69964,43994,-15121,-85530,12718,13170,-13547,69222,62417,-75305,-81446,-38786,-52075,-23110,97681,-82800,-53178,11474,35857,94197,-58148,-23689,32506,92154,-64536,-73930,-77138,97446,-83459,70963,22452,68472,-3728,-25059,-49405,95129,-6167,12808,99918,30113,-12641,-26665,86362,-33505,50661,26714,33701,89012,-91540,40517,-12716,-57185,-87230,29914,-59560,13200,-72723,58272,23913,-45586,-96593,-26265,-2141,31087,81399,92511,-34049,20577,2803,26003,8940,42117,40887,-82715,38269,40969,-50022,72088,21291,-67280,-16523,90535,18669,94342,-39568,-88080,-99486,-20716,23108,-28037,63342,36863,-29420,-44016,75135,73415,16059,-4899,86893,43136,-7041,33483,-67612,25327,40830,6184,61805,4247,81119,-22854,-26104,-63466,63093,-63685,60369,51023,51644,-16350,74438,-83514,99083,10079,-58451,-79621,48471,67131,-86940,99093,11855,-22272,-67683,-44371,9541,18123,37766,-70922,80385,-57513,-76021,-47890,36154,72935,84387,-92681,-88303,-7810,59902,-90,-64704,-28396,-66403,8860,13343,33882,85680,7228,28160,-14003,54369,-58893,92606,-63492,-10101,64714,58486,29948,-44679,-22763,10151,-56695,4031,-18242,-36232,86168,-14263,9883,47124,47271,92761,-24958,-73263,-79661,-69147,-18874,29546,-92588,-85771,26451,-86650,-43306,-59094,-47492,-34821,-91763,-47670,33537,22843,67417,-759,92159,63075,94065,-26988,55276,65903,30414,-67129,-99508,-83092,-91493,-50426,14349,-83216,-76090,32742,-5306,-93310,-60750,-60620,-45484,-21108,-58341,-28048,-52803,69735,78906,81649,32565,-86804,-83202,-65688,-1760,89707,93322,-72750,84134,71900,-37720,19450,-78018,22001,-23604,26276,-21498,65892,-72117,-89834,-23867,55817,-77963,42518,93123,-83916,63260,-2243,-97108,85442,-36775,17984,-58810,99664,-19082,93075,-69329,87061,79713,16296,70996,13483,-74582,49900,-27669,-40562,1209,-20572,34660,83193,75579,7344,64925,88361,60969,3114,44611,-27445,53049,-16085,-92851,-53306,13859,-33532,86622,-75666,-18159,-98256,51875,-42251,-27977,-18080,23772,38160,41779,9147,94175,99905,-85755,62535,-88412,-52038,-68171,93255,-44684,-11242,-104,31796,62346,-54931,-55790,-70032,46221,56541,-91947,90592,93503,4071,20646,4856,-63598,15396,-50708,32138,-85164,38528,-89959,53852,57915,-42421,-88916,-75072,67030,-29066,49542,-71591,61708,-53985,-43051,28483,46991,-83216,80991,-46254,-48716,39356,-8270,-47763,-34410,874,-1186,-7049,28846,11276,21960,-13304,-11433,-4913,55754,79616,70423,-27523,64803,49277,14906,-97401,-92390,91075,70736,21971,-3303,55333,-93996,76538,54603,-75899,98801,46887,35041,48302,-52318,55439,24574,14079,-24889,83440,14961,34312,-89260,-22293,-81271,-2586,-71059,-10640,-93095,-5453,-70041,66543,74012,-11662,-52477,-37597,-70919,92971,-17452,-67306,-80418,7225,-89296,24296,86547,37154,-10696,74436,-63959,58860,33590,-88925,-97814,-83664,85484,-8385,-50879,57729,-74728,-87852,-15524,-91120,22062,28134,80917,32026,49707,-54252,-44319,-35139,13777,44660,85274,25043,58781,-89035,-76274,6364,-63625,72855,43242,-35033,12820,-27460,77372,-47578,-61162,-70758,-1343,-4159,64935,56024,-2151,43770,19758,-30186,-86040,24666,-62332,-67542,73180,-25821,-27826,-45504,-36858,-12041,20017,-24066,-56625,-52097,-47239,-90694,8959,7712,-14258,-5860,55349,61808,-4423,-93703,64681,-98641,-25222,46999,-83831,-54714,19997,-68477,66073,51801,-66491,52061,-52866,79907,-39736,-68331,68937,91464,98892,910,93501,31295,-85873,27036,-57340,50412,21,-2445,29471,71317,82093,-94823,-54458,-97410,39560,-7628,66452,39701,54029,37906,46773,58296,60370,-61090,85501,-86874,71443,-72702,-72047,14848,34102,77975,-66294,-36576,31349,52493,-70833,-80287,94435,39745,-98291,84524,-18942,10236,93448,50846,94023,-6939,47999,14740,30165,81048,84935,-19177,-13594,32289,62628,-90612,-542,-66627,64255,71199,-83841,-82943,-73885,8623,-67214,-9474,-35249,62254,-14087,-90969,21515,-83303,94377,-91619,19956,-98810,96727,-91939,29119,-85473,-82153,-69008,44850,74299,-76459,-86464,8315,-49912,-28665,59052,-69708,76024,-92738,50098,18683,-91438,18096,-19335,35659,91826,15779,-73070,67873,-12458,-71440,-46721,54856,97212,-81875,35805,36952,68498,81627,-34231,81712,27100,-9741,-82612,18766,-36392,2759,41728,69743,26825,48355,-17790,17165,56558,3295,-24375,55669,-16109,24079,73414,48990,-11931,-78214,90745,19878,35673,-15317,-89086,94675,-92513,88410,-93248,-19475,-74041,-19165,32329,-26266,-46828,-18747,45328,8990,-78219,-25874,-74801,-44956,-54577,-29756,-99822,-35731,-18348,-68915,-83518,-53451,95471,-2954,-13706,-8763,-21642,-37210,16814,-60070,-42743,27697,-36333,-42362,11576,85742,-82536,68767,-56103,-63012,71396,-78464,-68101,-15917,-11113,-3596,77626,-60191,-30585,-73584,6214,-84303,18403,23618,-15619,-89755,-59515,-59103,-74308,-63725,-29364,-52376,-96130,70894,-12609,50845,-2314,42264,-70825,64481,55752,4460,-68603,-88701,4713,-50441,-51333,-77907,97412,-66616,-49430,60489,-85262,-97621,-18980,44727,-69321,-57730,66287,-92566,-64427,-14270,11515,-92612,-87645,61557,24197,-81923,-39831,-10301,-23640,-76219,-68025,92761,-76493,68554,-77734,-95620,-11753,-51700,98234,-68544,-61838,29467,46603,-18221,-35441,74537,40327,-58293,75755,-57301,-7532,-94163,18179,-14388,-22258,-46417,-48285,18242,-77551,82620,250,-20060,-79568,-77259,82052,-98897,-75464,48773,-79040,-11293,45941,-67876,-69204,-46477,-46107,792,60546,-34573,-12879,-94562,20356,-48004,-62429,96242,40594,2099,99494,25724,-39394,-2388,-18563,-56510,-83570,-29214,3015,74454,74197,76678,-46597,60630,-76093,37578,-82045,-24077,62082,-87787,-74936,58687,12200,-98952,70155,-77370,21710,-84625,-60556,-84128,925,65474,-15741,-94619,88377,89334,44749,22002,-45750,-93081,-14600,-83447,46691,85040,-66447,-80085,56308,44310,24979,-29694,57991,4675,-71273,-44508,13615,-54710,23552,-78253,-34637,50497,68706,81543,-88408,-21405,6001,-33834,-21570,-46692,-25344,20310,71258,-97680,11721,59977,59247,-48949,98955,-50276,-80844,-27935,-76102,55858,-33492,40680,66691,-33188,8284,64893,-7528,6019,-85523,8434,-64366,-56663,26862,30008,-7611,-12179,-70076,21426,-11261,-36864,-61937,-59677,929,-21052,3848,-20888,-16065,98995,-32293,-86121,-54564,77831,68602,74977,31658,40699,29755,98424,80358,-69337,26339,13213,-46016,-18331,64713,-46883,-58451,-70024,-92393,-4088,70628,-51185,71164,-75791,-1636,-29102,-16929,-87650,-84589,-24229,-42137,-15653,94825,13042,88499,-47100,-90358,-7180,29754,-65727,-42659,-85560,-9037,-52459,20997,-47425,17318,21122,20472,-23037,65216,-63625,-7877,-91907,24100,-72516,22903,-85247,-8938,73878,54953,87480,-31466,-99524,35369,-78376,89984,-15982,94045,-7269,23319,-80456,-37653,-76756,2909,81936,54958,-12393,60560,-84664,-82413,66941,-26573,-97532,64460,18593,-85789,-38820,-92575,-43663,-89435,83272,-50585,13616,-71541,-53156,727,-27644,16538,34049,57745,34348,35009,16634,-18791,23271,-63844,95817,21781,16590,59669,15966,-6864,48050,-36143,97427,-59390,96931,78939,-1958,50777,43338,-51149,39235,-27054,-43492,67457,-83616,37179,10390,85818,2391,73635,87579,-49127,-81264,-79023,-81590,53554,-74972,-83940,-13726,-39095,29174,78072,76104,47778,25797,-29515,-6493,-92793,22481,-36197,-65560,42342,15750,97556,99634,-56048,-35688,13501,63969,-74291,50911,39225,93702,-3490,-59461,-30105,-46761,-80113,92906,-68487,50742,36152,-90240,-83631,24597,-50566,-15477,18470,77038,40223,-80364,-98676,70957,-63647,99537,13041,31679,86631,37633,-16866,13686,-71565,21652,-46053,-80578,-61382,68487,-6417,4656,20811,67013,-30868,-11219,46,74944,14627,56965,42275,-52480,52162,-84883,-52579,-90331,92792,42184,-73422,-58440,65308,-25069,5475,-57996,59557,-17561,2826,-56939,14996,-94855,-53707,99159,43645,-67719,-1331,21412,41704,31612,32622,1919,-69333,-69828,22422,-78842,57896,-17363,27979,-76897,35008,46482,-75289,65799,20057,7170,41326,-76069,90840,-81253,-50749,3649,-42315,45238,-33924,62101,96906,58884,-7617,-28689,-66578,62458,50876,-57553,6739,41014,-64040,-34916,37940,13048,-97478,-11318,-89440,-31933,-40357,-59737,-76718,-14104,-31774,28001,4103,41702,-25120,-31654,63085,-3642,84870,-83896,-76422,-61520,12900,88678,85547,33132,-88627,52820,63915,-27472,78867,-51439,33005,-23447,-3271,-39308,39726,-74260,-31874,-36893,93656,910,-98362,60450,-88048,99308,13947,83996,-90415,-35117,70858,-55332,-31721,97528,82982,-86218,6822,25227,36946,97077,-4257,-41526,56795,89870,75860,-70802,21779,14184,-16511,-89156,-31422,71470,69600,-78498,74079,-19410,40311,28501,26397,-67574,-32518,68510,38615,19355,-6088,-97159,-29255,-92523,3023,-42536,-88681,64255,41206,44119,52208,39522,-52108,91276,-70514,83436,63289,-79741,9623,99559,12642,85950,83735,-21156,-67208,98088,-7341,-27763,-30048,-44099,-14866,-45504,-91704,19369,13700,10481,-49344,-85686,33994,19672,36028,60842,66564,-24919,33950,-93616,-47430,-35391,-28279,56806,74690,39284,-96683,-7642,-75232,37657,-14531,-86870,-9274,-26173,98640,88652,64257,46457,37814,-19370,9337,-22556,-41525,39105,-28719,51611,-93252,98044,-90996,21710,-47605,-64259,-32727,53611,-31918,-3555,33316,-66472,21274,-37731,-2919,15016,48779,-88868,1897,41728,46344,-89667,37848,68092,-44011,85354,-43776,38739,-31423,-66330,65167,-22016,59405,34328,-60042,87660,-67698,-59174,-1408,-46809,-43485,-88807,-60489,13974,22319,55836,-62995,-37375,-4185,32687,-36551,-75237,58280,26942,-73756,71756,78775,-40573,14367,-71622,-77338,24112,23414,-7679,-51721,87492,85066,-21612,57045,10673,-96836,52461,-62218,-9310,65862,-22748,89906,-96987,-98698,26956,-43428,46141,47456,28095,55952,67323,-36455,-60202,-43302,-82932,42020,77036,10142,60406,70331,63836,58850,-66752,52109,21395,-10238,-98647,-41962,27778,69060,98535,-28680,-52263,-56679,66103,-42426,27203,80021,10153,58678,36398,63112,34911,20515,62082,-15659,-40785,27054,43767,-20289,65838,-6954,-60228,-72226,52236,-35464,25209,-15462,-79617,-41668,-84083,62404,-69062,18913,46545,20757,13805,24717,-18461,-47009,-25779,68834,64824,34473,39576,31570,14861,-15114,-41233,95509,68232,67846,84902,-83060,17642,-18422,73688,77671,-26930,64484,-99637,73875,6428,21034,-73471,19664,-68031,15922,-27028,48137,54955,-82793,-41144,-10218,-24921,-28299,-2288,68518,-54452,15686,-41814,66165,-72207,-61986,80020,50544,-99500,16244,78998,40989,14525,-56061,-24692,-94790,21111,37296,-90794,72100,70550,-31757,17708,-74290,61910,78039,-78629,-25033,73172,-91953,10052,64502,99585,-1741,90324,-73723,68942,28149,30218,24422,16659,10710,-62594,94249,96588,46192,34251,73500,-65995,-81168,41412,-98724,-63710,-54696,-52407,19746,45869,27821,-94866,-76705,-13417,-61995,-71560,43450,67384,-8838,-80293,-28937,23330,-89694,-40586,46918,80429,-5475,78013,25309,-34162,37236,-77577,86744,26281,-29033,-91813,35347,13033,-13631,-24459,3325,-71078,-75359,81311,19700,47678,-74680,-84113,45192,35502,37675,19553,76522,-51098,-18211,89717,4508,-82946,27749,85995,89912,-53678,-64727,-14778,32075,-63412,-40524,86440,-2707,-36821,63850,-30883,67294,-99468,-23708,34932,34386,98899,29239,-23385,5897,54882,98660,49098,70275,17718,88533,52161,63340,50061,-89457,19491,-99156,24873,-17008,64610,-55543,50495,17056,-10400,-56678,-29073,-42960,-76418,98562,-88104,-96255,10159,-90724,54011,12052,45871,-90933,-69420,67039,37202,78051,-52197,-40278,-58425,65414,-23394,-1415,6912,-53447,7352,17307,-78147,63727,98905,55412,-57658,-32884,-44878,22755,39730,3638,35111,39777,74193,38736,-11829,-61188,-92757,55946,-71232,-63032,-83947,39147,-96684,-99233,25131,-32197,24406,-55428,-61941,25874,-69453,64483,-19644,-68441,12783,87338,-48676,66451,-447,-61590,50932,-11270,29035,65698,-63544,10029,80499,-9461,86368,91365,-81810,-71914,-52056,-13782,44240,-30093,-2437,24007,67581,-17365,-69164,-8420,-69289,-29370,48010,90439,13141,69243,50668,39328,61731,78266,-81313,17921,-38196,55261,9948,-24970,75712,-72106,28696,7461,31621,61047,51476,56512,11839,-96916,-82739,28924,-99927,58449,37280,69357,11219,-32119,-62050,-48745,-83486,-52376,42668,82659,68882,38773,46269,-96005,97630,25009,-2951,-67811,99801,81587,-79793,-18547,-83086,69512,33127,-92145,-88497,47703,59527,1909,88785,-88882,69188,-46131,-5589,-15086,36255,-53238,-33009,82664,53901,35939,-42946,-25571,33298,69291,53199,74746,-40127,-39050,91033,51717,-98048,87240,36172,65453,-94425,-63694,-30027,59004,88660,3649,-20267,-52565,-67321,34037,4320,91515,-56753,60115,27134,68617,-61395,-26503,-98929,-8849,-63318,10709,-16151,61905,-95785,5262,23670,-25277,90206,-19391,45735,37208,-31992,-92450,18516,-90452,-58870,-58602,93383,14333,17994,82411,-54126,-32576,35440,-60526,-78764,-25069,-9022,-394,92186,-38057,55328,-61569,67780,77169,19546,-92664,-94948,44484,-13439,83529,27518,-48333,72998,38342,-90553,-98578,-76906,81515,-16464,78439,92529,35225,-39968,-10130,-7845,-32245,-74955,-74996,67731,-13897,-82493,33407,93619,59560,-24404,-57553,19486,-45341,34098,-24978,-33612,79058,71847,76713,-95422,6421,-96075,-59130,-28976,-16922,-62203,69970,68331,21874,40551,89650,51908,58181,66480,-68177,34323,-3046,-49656,-59758,43564,-10960,-30796,15473,-20216,46085,-85355,41515,-30669,-87498,57711,56067,63199,-83805,62042,91213,-14606,4394,-562,74913,10406,96810,-61595,32564,31640,-9732,42058,98052,-7908,-72330,1558,-80301,34878,32900,3939,-8824,88316,20937,21566,-3218,-66080,-31620,86859,54289,90476,-42889,-15016,-18838,75456,30159,-67101,42328,-92703,85850,-5475,23470,-80806,68206,17764,88235,46421,-41578,74005,-81142,80545,20868,-1560,64017,83784,68863,-97516,-13016,-72223,79630,-55692,82255,88467,28007,-34686,-69049,-41677,88535,-8217,68060,-51280,28971,49088,49235,26905,-81117,-44888,40623,74337,-24662,97476,79542,-72082,-35093,98175,-61761,-68169,59697,-62542,-72965,59883,-64026,-37656,-92392,-12113,-73495,98258,68379,-21545,64607,-70957,-92254,-97460,-63436,-8853,-19357,-51965,-76582,12687,-49712,45413,-60043,33496,31539,-57347,41837,67280,-68813,52088,-13155,-86430,-15239,-45030,96041,18749,-23992,46048,35243,-79450,85425,-58524,88781,-39454,53073,-48864,-82289,39086,82540,-11555,25014,-5431,-39585,-89526,2705,31953,-81611,36985,-56022,68684,-27101,11422,64655,-26965,-63081,-13840,-91003,-78147,-8966,41488,1988,99021,-61575,-47060,65260,-23844,-21781,-91865,-19607,44808,2890,63692,-88663,-58272,15970,-65195,-45416,-48444,-78226,-65332,-24568,42833,-1806,-71595,80002,-52250,30952,48452,-90106,31015,-22073,62339,63318,78391,28699,77900,-4026,-76870,-45943,33665,9174,-84360,-22684,-16832,-67949,-38077,-38987,-32847,51443,-53580,-13505,9344,-92337,26585,70458,-52764,-67471,-68411,-1119,-2072,-93476,67981,40887,-89304,-12235,41488,1454,5355,-34855,-72080,24514,-58305,3340,34331,8731,77451,-64983,-57876,82874,62481,-32754,-39902,22451,-79095,-23904,78409,-7418,77916};
//        int [] num = new int[]{1,-2,5,4,-2,-10,16,15,5,8};
//        System.out.println("threeSum: "+algorithmStudy.threeSum3(num));
//        int[] num = new int[]{2,3,1,5};
//        int[] num = new int[]{3,3};
//        int[] num = new int[]{3,2,4};
//        int[] num = new int[]{1,4,8,2,9};
//        System.out.println(Arrays.toString(algorithmStudy.twoSum1(num,6)));

//        int[] num = new int[]{2,2,2,2,2};
//        System.out.println(algorithmStudy.fourSum(num,8));
//        int[] num = new int[]{1,0,-1,0,-2,2};
//        System.out.println(algorithmStudy.fourSum(num,0));
//        int[] num = new int[]{0,0,0,0};
//        System.out.println(algorithmStudy.fourSum(num,0));


//        int[] num = new int[]{1,2,0,1,2,1,1,1,2,2,1,1,0,0,2,0};
//        algorithmStudy.sortColors3(num);
//        System.out.println(Arrays.toString(num));


//        String s = "A man, a plan, a canal: Panama";
//        System.out.println(s + " :" + algorithmStudy.isPalindrome3(s));


        //斐波那契数列
//        System.out.println(algorithmStudy.fib2(6));

//        TimeTestUtils.testTask("分割回文串", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                String s = "efe";
//                System.out.println("print:" + s + "\nresult:" + algorithmStudy.partition3(s));
//            }
//        });

//        TimeTestUtils.testTask("反转字符串", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                String value = "asdbasasdasgajsdabjdbaskjdbasd";
//                algorithmStudy.reverseString(value.toCharArray());
//            }
//        });
//        TimeTestUtils.testTask("反转字符串2", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                //success:fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi
////                String test = algorithmStudy.reverseStr2("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",39);
//
//                //success:fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi
//                String test = algorithmStudy.reverseStr2("abcdefghijk",3);
//            }
//        });

//        TimeTestUtils.testTask("替换空格", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                String test = algorithmStudy.replaceSpace3("We are happy.");
//                System.out.println("result:"+test);
//            }
//        });
//        TimeTestUtils.testTask("翻转字符串里的单词", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                String test1 = algorithmStudy.reverseWords4("We are happy");
//                String test2 = algorithmStudy.reverseWords4("  hello world  ");
//                String test3 = algorithmStudy.reverseWords4("a good   example");
//                String test4 = algorithmStudy.reverseWords4("  Bob    Loves  Alice   ");
//                String test5 = algorithmStudy.reverseWords4("Alice does not even like bob");
//                String test6 = algorithmStudy.reverseWords4(" Alice ");
//                String test7 = algorithmStudy.reverseWords4("  Alice     a  a ");
//                String test8 = algorithmStudy.reverseWords4(" Alice");
//                String test9 = algorithmStudy.reverseWords4(" Alice a");
//            }
//        });
//        TimeTestUtils.testTask("左旋转字符串", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
////                String test1 = algorithmStudy.reverseLeftWords("abcdefg",2);
//                String test2 = algorithmStudy.reverseLeftWords2("abcdefg",2);
//                String test3 = algorithmStudy.reverseLeftWords3("abcdefg",2);
//                String test4 = algorithmStudy.reverseLeftWords4("abcdefg",2);
//            }
//        });

//        TimeTestUtils.testTask("字符串匹配：实现 strStr()", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                String haystack = "";
//                String needle = "";
//
////                haystack = "hello world a a  ";
////                needle = " a  ";
//
////                haystack = "hello";
////                needle = "";
//
////                haystack = "";
////                needle = "";
//
////                haystack = "";
////                needle = "a";
//
////                haystack = "aaabc";
////                needle = "aabc";;
//
//
////                haystack = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
////                needle = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//
////                haystack = "aabaabaaf";
////                needle = "aabaaf";
//
////                haystack = "abbababbabbbabababbaabbabaaabbabbbabaabb";
////                needle = "abbabbbabaa";
//
////                haystack = "ababaabbbbababbaabaaabaabbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbbaabbbabbbaabbbbaaabbababbabbbabababbaabbabababbbaaaaaaababbabaababaabbbbaaabbbabb";
////                needle = "abbabbbabab";
//
//
////                haystack = "abcccacdcacacc";
////                needle = "cacdcac";
//
//                //不匹配结束
////                haystack = "aaaaa";
////                needle =   "bba";
//
////                haystack = "abc";
////                needle =   "c";
//
////                haystack = "ababbbbaaabbbaaa";
////                needle =   "bbbb";
//
////                haystack = "babbbbbabb";
////                needle =   "bbab";
//
////                haystack = "a";
////                needle = "a";
//
////                int index = algorithmStudy.strStr(haystack,needle);
////                System.out.println("strStr-index:"+index);
//
//
//                //BM算法极端情况
//                haystack = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//                needle =   "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//
////                int index = algorithmStudy.strStr(haystack,needle);
////                int index = algorithmStudy.strStr2(haystack,needle);
////                int index = algorithmStudy.kmpIndexOf(haystack,needle);
//                int index = algorithmStudy.bmIndexOf(haystack,needle);
//                System.out.println("bmIndexOf-index:"+index);
//                System.out.println("indexOf-index:"+haystack.indexOf(needle));
//            }
//        });

//        TimeTestUtils.testTask("字符串匹配：重复的子字符串", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
////                boolean flag = algorithmStudy.repeatedSubstringPattern("cbaabccbaabc");
//                boolean flag = algorithmStudy.repeatedSubstringPattern3("aabbccaabbcc");
//                System.out.println("flag:"+flag);
//            }
//        });
//        TimeTestUtils.testTask("全排列", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] num = {1,2,3};
//                System.out.println("result:"+algorithmStudy.permute(num));
//            }
//        });

//        TimeTestUtils.testTask("组合", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                System.out.println("result:"+algorithmStudy.combine(4,4));
//            }
//        });
//        TimeTestUtils.testTask("组合总和III", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                System.out.println("result:"+algorithmStudy.combinationSum3(2,9));
//            }
//        });

//        TimeTestUtils.testTask("验证回文串", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                System.out.println("result:"+algorithmStudy.isPalindromeTest("P0"));
//            }
//        });
//        TimeTestUtils.testTask("分割回文串", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
////                String test = "abcdefgh";
////                System.out.println("test:"+test.substring(3,7)); //defg
//                System.out.println("result:"+algorithmStudy.partitionTest("aab"));
//            }
//        });
//        TimeTestUtils.testTask("长度最小的子数组", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
////                String test = "abcdefgh";
////                System.out.println("test:"+test.substring(3,7)); //defg
////                int target = 213;
////                int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
////                System.out.println("result:"+algorithmStudy.minSubArrayLen(target,nums));
////                System.out.println("result:"+algorithmStudy.minSubArrayLen2(target,nums));
//
//                int target = 11;
//                int[] nums = {1,1,1,1,1,1,1,1};
//                System.out.println("result:"+algorithmStudy.minSubArrayLen3(target,nums));
//            }
//        });

//        TimeTestUtils.testTask("和为K的子数组", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
////                int[] nums = {1,-2,5,8,0,10,-4,6};
////                int k = 3;
//                System.out.println("result:"+algorithmStudy.subarraySum(nums,k));
//                System.out.println("result2:"+algorithmStudy.subarraySum2(nums,k));
//            }
//        });
//        TimeTestUtils.testTask("乘积小于K的子数组", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
////                int[] nums = {10,5,2,6};
////                int k = 100;
//
//                int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
//                int k = 19;
//
////                int[] nums = {4,32,23,1,11,21,8,3,12,21,33,5,14,11,9,14,4,27,5,7,7,14,13,9,17,10,3,4,17,31,7,19,4,7,20,5,4,3,24,30,9,11,23,16,7,21,23,22,12,20,8,20,18,11,5,8,21,5,11,31,28,21,13,21,22,3,2,1,32,8,8,27,4,26,13,14,4,15,6,10,28,15,18,20,29,1,1,12,5,18,10,9,5,13,1,2,7,3,23,26,3,4,13,9,32,32,31,26,19,8,7,29,16,21,28,14,18,5,25,3,4,33,27,3,10,10,22,13,13,32,18,11,27,12,3,33,21,3,5,23,12,23,23,20,24,31,26,7,25,1,5,28,1,1,29,7,31,20,21,32,23,24,13,21,14,30,8,5,23,26,31,31,25,33,17,30,20,20,16,16,2,8,10,5,10,16,27,8,25,5,3,22,21,30,25,20,4,10,9,4,3,20,14,13,4,3,3,1,32,29,13,25,13,28,10,26,17,29,13,28,20,22,6,6,2,30,15,2,29,21,10,28,33,22,6,25,8,18,29,17,1,25,17,27,27,28,16,18,3,4,5,28,20,32,11,23,1,33,12,7,29,32,6,33,15,33,24,13,32,15,24,20,11,27,20,7,2,21,6,11,16,27,24,22,7,4,15,16,1,25,22,16,4,9,19,16,10,14,9,30,18,17,6,8,9,23,1,9,22,20,5,1,15,30,23,3,8,10,9,22,24,9,24,9,5,20,27,16,22,7,6,11,22,27,31,16,30,8,14,12,9,2,29,33,13,18,14,30,20,19,16,33,8,31,31,30,6,15,6,2,30,15,32,17,33,14,22,2,4,23,22,21,29,8,31,26,28,26,20,12,12,18,1,20,17,8,10,10,4,5,7,28,8,31,13,11,31,17,27,27,25,10,8,30,12,17,24,19,16,31,28,15,28,17,16,7,16,1,23,7,25,11,5,19,3,1,14,10,29,19,17,29,20,20,24,5,1,29,29,14,16,2,7,29,15,14,18,14,20,4,9,30,8,28,30,18,18,15,20,6,5,2,29,3,1,29,3,6,12,16,20,27,6,5,30,14,3,9,16,15,28,2,11,22,16,12,9,15,10,22,18,13,29,31,26,31,33,21,13,20,20,12,33,15,22,7,31,24,21,21,30,7,25,31,28,25,19,8,27,27,16,31,17,12,20,30,23,15,21,1,6,10,28,10,27,31,24,9,3,23,8,30,31,2,19,8,31,3,16,30,32,1,9,9,10,30,29,12,28,20,32,22,33,2,1,18,33,32,16,9,5,21,27,29,14,6,6,21,13,23,18,15,29,21,32,29,4,9,5,33,22,7,11,17,24,10,13,4,10,1,3,11,8,12,20,18,11,8,2,25,6,25,18,1,1,21,19,11,5,2,12,7,20,20,2,31,14,26,16,15,22,6,27,6,10,20,20,31,20,13,20,12,24,15,16,23,18,3,22,22,8,20,3,5,20,16,11,11,28,2,2,32,18,28,12,32,12,27,26,30,29,4,1,22,14,7,12,23,31,11,18,7,25,12,8,24,9,14,17,25,16,4,3,29,22,17,25,17,26,22,22,19,28,2,17,24,19,18,26,9,4,25,23,15,25,23,24,29,20,18,13,22,11,9,24,12,14,6,1,22,1,21,21,8,13,15,8,29,13,2,8,17,8,27,14,6,9,29,25,31,3,10,22,30,11,19,4,12,10,6,21,27,16,22,8,32,13,6,19,30,29,26,22,2,11,8,28,17,19,10,11,19,33,23,15,12,32,31,20,5,16,11,16,4,13,24,26,18,33,14,30,33,24,19,33,19,12,27,24,29,33,13,14,10,22,25,24,32,18,5,9,6,33,27,31,26,12,16,7,30,3,12,25,11,12,28,31,5,32,13,1,5,3,26,11,25,9,28,16,3,27,13,19,18,16,12,15,18,9,4,25,6,16,14,2,10,20,22,20,20,8,7,7,5,32,30,9,27,33,22,4,13,8,6,11,18,18,27,26,27,25,15,22,16,11,13,15,25,11,29,7,3,15,26,21,27,22,29,11,16,2,25,32,24,17,11,13,15,9,33,31,14,20,22,32,4,25,13,28,33,4,9,16,20,22,6,23,7,18,30,9,12,19,32,27,33,5,22,18,9,9,6,5,5,4,4,33,16,13,5,28,24,24,6,1,14,13,12,15,10,24,22,12,10,31,33,29,24,18,18,13,25,26,32,15,3,14,14,26,19,32,15,33,33,2,6,10,24,21,21,31,31,12,22,12,6,30,32,8,16,24,26,13,13,16,5,17,26,4,4,7,27,27,5,14,24,23,32,13,3,23,10,30,23,31,30,18,25,11,24,21,7,19,13,19,4,28,22,27,2,17,12,33,32,4,25,21,23,24,7,13,21,33,7,33,31,7,20,30,13,22,19,33,16,2,20,4,31,2,31,21,12,24,23,22,2,20,19,15,2,28,4,9,30,15,13,30,4,17,24,13,32,2,12,24,24,19,11,19,6,33,2,9,26,25,16,15,24,6,15,4,28,2,3,32,18,10,2,13,24,16,13,28,28,22,33,25,21,2,5,2,21,1,8,17,2,5,18,33,29,27,20,30,27,23,25,1,8,19,33,22,30,17,24,17,7,16,16,4,25,23,4,31,12,10,30,17,17,14,4,24,10,32,13,14,15,29,17,13,7,4,21,16,23,16,2,13,12,33,23,27,33,28,15,31,25,13,12,20,14,18,18,7,31,3,31,30,33,13,6,26,13,14,33,26,4,17,13,7,15,5,18,19,24,25,15,14,33,19,26,19,16,27,20,12,6,11,6,5,17,29,17,10,25,26,10,6,8,25,5,11,11,7,32,14,2,2,32,25,12,30,20,32,18,30,19,20,30,31,11,21,13,27,22,15,9,26,4,10,4,9,2,5,5,31,14,26,32,8,30,19,16,27,6,4,12,17,18,24,13,17,16,4,5,30,11,21,21,21,4,25,26,13,2,13,2,8,32,6,12,32,9,30,15,24,11,7,26,14,10,10,22,13,28,2,21,20,19,16,1,14,16,1,26,8,3,14,4,20,1,3,21,26,25,20,1,18,17,6,16,8,17,30,24,32,9,4,24,8,23,12,28,4,32,5};
////                int k = 9931;
//                System.out.println("result:"+algorithmStudy.numSubarrayProductLessThanK(nums,k));
//                System.out.println("result2:"+algorithmStudy.numSubarrayProductLessThanK2(nums,k));
//                System.out.println("result2:"+algorithmStudy.numSubarrayProductLessThanK3(nums,k));
//            }
//        });

//        TimeTestUtils.testTask("删除有序数组中的重复项", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
//                System.out.println("result:"+algorithmStudy.removeDuplicates(nums1));
//                int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
//                System.out.println("result2:"+algorithmStudy.removeDuplicates2(nums2));
//            }
//        });
//        TimeTestUtils.testTask("移除元素", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums1 = {0,1,2,2,3,0,4,2};
//                int val1 = 2;
//                System.out.println("result1:"+algorithmStudy.removeElement(nums1,val1));
//                int[] nums2 = {0,1,2,2,3,0,4,2};
//                int val2 = 2;
//                System.out.println("result2:"+algorithmStudy.removeElement2(nums2,val2));
//            }
//        });

//        TimeTestUtils.testTask("数组中重复的数字", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums1 = {0, 1, 2, 2, 3, 0, 4, 2};
//                System.out.println("result1:" + algorithmStudy.findRepeatNumber(nums1));
//                int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
//                System.out.println("result2:" + algorithmStudy.findRepeatNumber2(nums2));
//                int[] nums3 = {0, 1, 2, 2, 3, 0, 4, 2};
//                System.out.println("result3:" + algorithmStudy.findRepeatNumber3(nums3));
//                int[] nums4 = {0, 1, 2, 2, 3, 0, 4, 2};
//                System.out.println("result4:" + algorithmStudy.findRepeatNumber4(nums4));
////                int[] nums5 = {0, 1, 2, 2, 3, 0, 4, 2};
//                int[] nums5 = {2, 3, 1, 0, 2, 5, 3};
//                System.out.println("result5:" + algorithmStudy.findRepeatNumber5(nums5));
//            }
//        });

//        TimeTestUtils.testTask("找到所有数组中消失的数字", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
////                int[] nums1 = {4,3,2,7,8,2,3,1};
////                System.out.println("result1:" + algorithmStudy.findDisappearedNumbers(nums1));
//                int[] nums2 = {4,3,2,7,8,2,3,1};
//                System.out.println("result1:" + algorithmStudy.findDisappearedNumbers2(nums2));
//            }
//        });

//        TimeTestUtils.testTask("链表中倒数第k个结点", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,2,3,4,5,6,7,8};
//                ListNode listNode = ListNode.arrayToListNode(nums);
//                int k = 3;
////                ListNode result = algorithmStudy.getKthFromEnd(listNode,k);
////                System.out.println("result1:" + result + " result: "+result.val);
////                ListNode result2 = algorithmStudy.getKthFromEnd2(listNode,k);
////                System.out.println("result2:" + result2 + " result2: "+result2.val);
////                ListNode result3 = algorithmStudy.getKthFromEnd3(listNode, k);
////                System.out.println("result2:" + result3 + " result2: "+result2.val);
////                ListNode result4 = algorithmStudy.getKthFromEnd4(listNode, k);
////                System.out.println("result4:" + result4 + " result4: "+result4.val);
//                ListNode result5 = algorithmStudy.getKthFromEnd5(listNode, k);
//                System.out.println("result5:" + result5 + " result5: " + result5.val);
//            }
//        });


//        TimeTestUtils.testTask("反转链表", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,2,3,4,5};
//                ListNode listNode = ListNode.arrayToListNode(nums);
////                ListNode result1 = algorithmStudy.reverseList(listNode);
////                ListNode result2 = algorithmStudy.reverseList2(listNode);
//                ListNode result3 = algorithmStudy.reverseList3(listNode);
////                ListNode.print(result1);
////                ListNode.print(result2);
//                System.out.print("result: ");
//                ListNode.print(result3);
//
//            }
//        });

//        TimeTestUtils.testTask(" 移除链表元素", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,5,3,6,5,4,8,5};
//                int val = 5;
//                ListNode listNode = ListNode.arrayToListNode(nums);
//                System.out.print("old: ");
//                ListNode.print(listNode);
//                ListNode result1 = algorithmStudy.removeElements3(listNode,val);
//                System.out.print("result: ");
//                ListNode.print(result1);
//
//            }
//        });

//        TimeTestUtils.testTask("普通数组转化稀疏数组", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[][] array = new int[10][10];
//                array[1][2] = 1;
//                array[3][1] = 2;
//                array[2][2] = 2;
//                System.out.println("原数组");
//                for (int[] numbers : array) {
//                    for (int number : numbers) {
//                        System.out.print(number + "\t" );
//                    }
//                    System.out.println();
//                }
//
//                int[][] result = algorithmStudy.toSparseArray(array);
//                System.out.println("稀疏数组");
//                for (int[] numbers : result) {
//                    for (int number : numbers) {
//                        System.out.print(number + "\t" );
//                    }
//                    System.out.println();
//                }
//
//                int[][] result2 = algorithmStudy.toArray(result);
//                System.out.println("稀疏数组转换成普通数组");
//                for (int[] numbers : result2) {
//                    for (int number : numbers) {
//                        System.out.print(number + "\t" );
//                    }
//                    System.out.println();
//                }
//            }
//        });

//        TimeTestUtils.testTask("删除链表的倒数第 N 个结点", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,2,3,4,5,6,7,8};
//                ListNode head = ListNode.arrayToListNode(nums);
//                int n = 2;
//                System.out.print("head: ");
//                ListNode.print(head);
//                ListNode result = algorithmStudy.removeNthFromEnd3(head,n);
//                System.out.print("result: ");
//                ListNode.print(result);
//            }
//        });
//        TimeTestUtils.testTask("环形链表", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {3,2,0,-4,5};
//                ListNode node = ListNode.arrayToListNode(nums);
//                ListNode.toCircle(node,2);
//                System.out.println("result: " + algorithmStudy.hasCycle2(node));
//            }
//        });

//        TimeTestUtils.testTask("环形链表2", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,2,3,4,5,6,7,8,9,10};
//                ListNode node = ListNode.arrayToListNode(nums);
//                ListNode.toCircle(node,8);
//                algorithmStudy.detectCycle2(node);
//            }
//        });

//        TimeTestUtils.testTask("链表相交", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] numsA = {4,1,8,4,5};
//                int[] numsB = {5,0,1,8,4,5};
//                ListNode nodeA = ListNode.arrayToListNode(numsA);
//                ListNode nodeB = ListNode.arrayToListNode(numsB);
//                System.out.println("result:" + algorithmStudy.getIntersectionNode(nodeA,nodeB));
//            }
//        });
//        TimeTestUtils.testTask("两两交换链表中的节点", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,2,3,4,6};
//                ListNode node = ListNode.arrayToListNode(nums);
//                System.out.println("result:" + algorithmStudy.swapPairsStack(node));
//            }
//        });

//        TimeTestUtils.testTask("队列的最大值", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,2,3,4,6};
//                MaxQueue maxQueue = new MaxQueue();
//                maxQueue.push_back(1);
//                maxQueue.push_back(5);
//                maxQueue.push_back(4);
//                System.out.println("result1:" + maxQueue.toString());
//                System.out.println("result1:" + maxQueue.max_value());
//                maxQueue.push_back(7);
//                maxQueue.push_back(22);
//                maxQueue.push_back(6);
//                maxQueue.push_back(6);
//                System.out.println("result1:" + maxQueue.toString());
//                System.out.println("result1:" + maxQueue.max_value());
//            }
//        });

//        TimeTestUtils.testTask("合并两个排序的链表", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums1 = {1,2,4};
//                int[] nums2 = {1,3,4};
//                ListNode node1 = ListNode.arrayToListNode(nums1);
//                ListNode node2 = ListNode.arrayToListNode(nums2);
//                ListNode result = algorithmStudy.mergeTwoLists2(node1,node2);
//                ListNode.print(result);
//            }
//        });

//        TimeTestUtils.testTask("滑动窗口的最大值", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                int[] nums = {1,3,-1,-3,5,3,6,7};
//                int[] result = algorithmStudy.maxSlidingWindow(nums, 3);
//                System.out.println("result: " + Arrays.toString(result));
//            }
//        });

//        TimeTestUtils.testTask("设计循环队列", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                LinkedCircularQueue queue = new LinkedCircularQueue(5);
//                queue.enQueue(1);
//                queue.enQueue(3);
//                queue.enQueue(4);
//                queue.enQueue(7);
//                queue.print();
//                queue.deQueue();
//                System.out.println("当前队列队头:"+queue.Front());
//                System.out.println("当前队列队尾:"+queue.Rear());
//                queue.deQueue();
//                queue.print();
//            }
//        });

        TimeTestUtils.testTask("树的最大深度", new TimeTestUtils.Task() {
            @Override
            public void execute() {
                TreeNode root = new TreeNode(3);
                TreeNode rootLeft = new TreeNode(9);
                TreeNode rootRight = new TreeNode(20);
                root.left = rootLeft;
                root.right = rootRight;
                TreeNode rootRightLeft = new TreeNode(15);
                TreeNode rootRightRight = new TreeNode(7);
                rootRight.left = rootRightLeft;
                rootRight.right = rootRightRight;

                System.out.println("depth:" + algorithmStudy.maxDepth(root));
            }
        });
    }


    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 线性时间复杂度，不使用额外空间
     * <p>
     * 解题思路：位运算解决
     * a^a=0；自己和自己异或等于0
     * a^0=a；任何数字和0异或还等于他自己
     * a^b^c=a^c^b；异或运算具有交换律
     *
     * @param numbers
     * @return
     */
    public int singleNumber(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result ^= number;
        }
        return result;
    }

    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 线性时间复杂度，不使用额外空间
     * <p>
     * 解题思路：Set特性解决
     *
     * @param numbers
     * @return
     */
    public int singleNumber2(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int number : numbers) {
            if (!numberSet.add(number)) {
                numberSet.remove(number);
            }
        }
        return (int) numberSet.toArray()[0];
    }

    /**
     * 位运算优化空间复杂度版本
     *
     * @param numbers
     * @return
     */
    public int singleNumber3(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] ^= numbers[i];
        }
        return numbers[0];
    }

    /**
     * 先排序，再遍历
     *
     * @param numbers
     * @return
     */
    public int singleNumber4(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i = i + 2) {
            if (i == numbers.length - 1) {
                return numbers[i];
            } else {
                if (numbers[i] != numbers[i + 1]) {
                    return numbers[i];
                }
            }
        }
        return -1;
    }


    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * 先排序，再/2
     * 时间复杂度 O(NLogN)
     * 空间复杂度 O(NLogN)
     *
     * @param numbers
     * @return
     */
    public int majorityElement(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length / 2];
    }

    /**
     * 通过Map解决，Key存放数组元素，value存放key出现的次数，
     * 通过循环遍历更新key出现的次数，一直到value > （number.length / 2），则key为多数元素
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     *
     * @param numbers
     * @return
     */
    public int majorityElement2(int[] numbers) {
        if (numbers.length == 1) return numbers[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            if (map.containsKey(number)) {
                if (map.get(number) + 1 > (numbers.length / 2)) {
                    return number;
                } else {
                    map.put(number, map.get(number) + 1);
                }
            } else {
                map.put(number, 1);
            }
        }
        return -1;
    }

    /**
     * 摩尔投票解法(两两抵消)
     * 时间复杂度 O(N)
     * 空间复杂度 O(1)
     *
     * @param numbers
     * @return
     */
    public int majorityElement3(int[] numbers) {
        int temp = 0;
        int count = 0;
        for (int number : numbers) {
            if (count == 0) {
                count++;
                temp = number;
            } else if (temp == number) {
                count++;
            } else {
                count--;
            }
        }
        return temp;
    }


    /**
     * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素
     * 摩尔投票法则，大于n/k的众数最多出现 k-1个 例如 n/3: 3-1 = 2个
     * 因为题目没有保证数组一定出现超过n/3次的元素，所有情况会有3种：
     * Situation 1: 2个候选人大于n/3
     * Situation 2: 1个候选人大于n/3
     * Situation 3: 0个候选人大于n/3
     *
     * @param numbers
     * @return
     */
    public List<Integer> majorityElement1_3_1(int[] numbers) {
        List<Integer> result = new ArrayList<>();
//        Set<Integer> set= new HashSet<>();
        if (numbers == null || numbers.length == 0) return result;
        //候选人1和他的票数
        int candidate1 = -1;
        int count1 = 0;
        //候选人2和他的票数
        int candidate2 = -1;
        int count2 = 0;
        // 摩尔投票法分为两个阶段: 配对阶段和计数阶段
        // 1.配对阶段，选出候选人
        for (int number : numbers) {
            //候选人1票数加+1
            if (candidate1 == number) {
                count1++;
                continue;
            }
            //候选人1票数加+1
            if (candidate2 == number) {
                count2++;
                continue;
            }
            //候选人1配对
            if (count1 == 0) {
                candidate1 = number;
                count1++;
                continue;
            }
            //候选人2配对
            if (count2 == 0) {
                candidate2 = number;
                count2++;
                continue;
            }

            // 如果count1和count2的数量都不为0，则说明候选人1,2的票数还有，那这一票属于非候选人的票，则执行3消，候选人1,2票数都-1
            count1--;
            count2--;
        }
        System.out.println("候选人1: " + candidate1);
        System.out.println("候选人2: " + candidate2);

        //2.计数阶段
        //循环遍历取候选人最终结果
        // 因为题目没有保证数组一定出现超过n/3次的元素，所有情况会有3种：
        // Situation 1: 2个候选人大于n/3
        // Situation 2: 1个候选人大于n/3
        // Situation 3: 0个候选人大于n/3
        count1 = 0;
        count2 = 0;
        for (int number : numbers) {
            if (candidate1 == number) {
                count1++;
            } else if (candidate2 == number) {
                count2++;
            }
        }
        if (count1 > (numbers.length / 3)) {
            result.add(candidate1);
        }
        if (count2 > (numbers.length / 3)) {
            result.add(candidate2);
        }
        return result;
    }

    /**
     * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素
     * 通过哈希表解法
     *
     * @param numbers
     * @return
     */
    public List<Integer> majorityElement1_3_2(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null || numbers.length == 0) return result;
        //哈希表解法
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int number : numbers) {
            if (numberMap.containsKey(number)) {
                numberMap.put(number, numberMap.get(number) + 1);
            } else {
                numberMap.put(number, 1);
            }
        }
        for (int number : numbers) {
            if (numberMap.get(number) > (numbers.length / 3)) {
                if (!result.contains(number)) result.add(number);
            }
        }
        return result;
    }


    /**
     * 搜索二维矩阵 II
     * 每行的所有元素从左到右升序排列
     * 每列的所有元素从上到下升序排列
     * 时间复杂度 T(N) = O(NLogN)
     * 空间复杂度 S(N) = O(1)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        //分治思想：大问题分解成多个子问题，二维数组查找拆分为m个一维数组（matrix[m]）的查找
        //二分查找：二维数组每行所有元素从左到右升序排列，可以运用二分查找技术，逐个遍历搜索元素
        if (matrix == null || matrix.length == 0) return false;
        //优化：每行所有元素从左到右升序排列，则先用target查看是否在每一个一维数组的区间内，再二分查找
        for (int[] array : matrix) {
            if (target >= array[0] && target <= array[array.length - 1]) {
                if (binarySearch(array, target)) return true;
            }
        }
        return false;
    }

    /**
     * 二分查找
     * 时间复杂度 T(N) = O(LogN)
     * 空间复杂度 S(N) = O(1)
     *
     * @param array  数组
     * @param target 查找数字
     * @return result 是否存在
     */
    public boolean binarySearch(int[] array, int target) {
        if (array.length == 1) return array[0] == target;
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2; //start + (end - start) 等价 (start + end) / 2
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }


    /**
     * 搜索二维矩阵 II（双向二分查找）
     * 每行的所有元素从左到右升序排列
     * 每列的所有元素从上到下升序排列
     * 时间复杂度 T(N) = O(lg(n!))
     * 空间复杂度 S(N) = O(1)
     */
    public boolean searchMatrix2(int[][] matrix, int target) {
        //分治思想：大问题分解成多个子问题，二维数组查找拆分为m个一维数组（matrix[m]）的查找
        //二分查找：二维数组每行所有元素从左到右升序排列，可以运用二分查找技术，逐个遍历搜索元素
        //搜索优化：从行，列2个方向并行二分查找，提高效率
        if (matrix == null || matrix.length == 0) return false;
        //取行和列的最小值
        int min = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < min; i++) {
            //二分查找每一行（由上到下）
            if (binarySearch2(matrix, target, i, true)) return true;
            //二分查找每一列（由左到右）
            if (binarySearch2(matrix, target, i, false)) return true;
        }
        return false;
    }

    /**
     * 二分查找（多方向）
     * 同时搜索二维数组的行和列
     *
     * @param array        数组
     * @param target       目标数字
     * @param lo           开始的下标（行或列）
     * @param isHorizontal 方向：是否水平方向搜索
     * @return result 是否存在
     */
    public boolean binarySearch2(int[][] array, int target, int lo, boolean isHorizontal) {
        //左上角开始搜索
        int start = lo;
        int end = isHorizontal ? array[0].length - 1 : array.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) >> 1;
            if (isHorizontal) {  //搜索水平方向（列）
                if (target < array[lo][mid]) {
                    end = mid - 1;
                } else if (target > array[lo][mid]) {
                    start = mid + 1;
                } else {
                    return true;
                }
            } else { //搜索竖直方向(行)
                if (target < array[mid][lo]) {
                    end = mid - 1;
                } else if (target > array[mid][lo]) {
                    start = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 搜索二维矩阵 II（双向二分查找）
     * 每行的所有元素从左到右升序排列
     * 每列的所有元素从上到下升序排列
     * 时间复杂度 T(N) = O(m + n)
     * 空间复杂度 S(N) = O(1)
     */
    public boolean searchMatrix3(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        //左下角的指针
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) { //当前指向的值大于目标值，“向上” 移动一行
                row--;
            } else if (matrix[row][col] < target) { //当前指向的值小于目标值，“向右” 移动一列
                col++;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 合并两个有序数组
     * 合并+排序
     * 时间复杂度：T(N) = O((m+n)Log(m+n))
     * 空间复杂度：S(N) = O(Log(m+n))
     *
     * @param nums1 有序数组1
     * @param m     数组1的长度
     * @param nums2 有序数组2
     * @param n     数组2的长度
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //先合并再排序
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /**
     * 合并两个有序数组
     * 双指针遍历插入数组 (正序遍历)
     *
     * @param nums1 有序数组1
     * @param m     数组1的长度
     * @param nums2 有序数组2
     * @param n     数组2的长度
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        //通过双指针记录两个数组的访问下标，通过轮训不断比较并插入合适的位置
        //归并排序思路：创建一个适合大小的数组，将2个数组按照大小依次放入新数组中完成合并
        if (nums1 == null || nums2 == null) return;
        if (m == 0 && n == 0) return;
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;
        //2个数组中，其中一个数组长度为0，则结果 = 其中一个数组
        if (m == 0 && n != 0) {
            int y = 0;
            while (y < n) {
                nums1[index++] = nums2[y++];
            }
            return;
        } else if (n == 0 && m != 0) {
            return;
        }
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[index++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                temp[index++] = nums2[j++];
            }
        }
        //检查nums1和nums2是否全部合并
        //1.nums1剩余元素直接按顺序加入temp
        while (i < m) {
            temp[index++] = nums1[i++];
        }
        //2.nums2剩余元素直接按顺序加入temp
        while (j < n) {
            temp[index++] = nums2[j++];
        }
        //copy temp数组给num1
        int k = 0;
        while (k < temp.length) {
            nums1[k] = temp[k++];
        }
    }


    /**
     * 合并两个有序数组
     * 双指针遍历插入数组(正序遍历-优化)
     * 时间复杂度：T(N) = O(m+n)
     * 空间复杂度：S(N) = O(m+n)
     *
     * @param nums1 有序数组1
     * @param m     数组1的长度
     * @param nums2 有序数组2
     * @param n     数组2的长度
     */
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        //通过双指针记录两个数组的访问下标，通过轮训不断比较并插入合适的位置
        //归并排序思路：创建一个适合大小的数组，将2个数组按照大小依次放入新数组中完成合并
        if (nums1 == null || nums2 == null) return;
        if (m == 0 && n == 0) return;
        //合并临时数组
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int current;
        while (i < m || j < n) {
            if (i == m) {
                current = nums2[j++];
            } else if (j == n) {
                current = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                current = nums1[i++];
            } else {
                current = nums2[j++];
            }
            temp[i + j - 1] = current;
        }
        //copy temp数组给num1
        int k = 0;
        while (k < temp.length) {
            nums1[k] = temp[k++];
        }
    }

    /**
     * 合并两个有序数组
     * 双指针遍历插入数组(逆序 优化)
     * 时间复杂度：T(N) = O(m+n)
     * 空间复杂度：S(N) = O(1)
     *
     * @param nums1 有序数组1
     * @param m     数组1的长度
     * @param nums2 有序数组2
     * @param n     数组2的长度
     */
    public void merge4(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) return;
        if (m == 0 && n == 0) return;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 || j >= 0) {
            if (i == -1) {
                nums1[i + j + 1] = nums2[j--];
            } else if (j == -1) {
                nums1[i + j + 1] = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                nums1[i + j + 1] = nums1[i--];
            } else {
                nums1[i + j + 1] = nums2[j--];
            }
        }
    }


    /**
     * 三数之和 暴力解法
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
     * 注意：答案中不可以包含重复的三元组。
     * 时间复杂度 T(N) = O(n^3)
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length < 3) return result;
        List<Integer> threeList;
        //不重复的三元组：使用set泛型存储找到的三元组保证去重
        Set<List<Integer>> threeSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    //三元组的条件 && 不重复选取同一位置元素
                    if ((numbers[i] + numbers[j] + numbers[k]) == 0 && (i != j && j != k && i != k)) {
                        threeList = new ArrayList<>();
                        threeList.add(numbers[i]);
                        threeList.add(numbers[j]);
                        threeList.add(numbers[k]);
                        Collections.sort(threeList);
                        threeSet.add(threeList);
                    }
                }
            }
        }
        result = new ArrayList<>(threeSet);
        return result;
    }

    /**
     * 三数之和 优化(排序+双指针+Set去重)
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
     * 注意：答案中不可以包含重复的三元组。
     * 时间复杂度 T(N) = O(n^2)
     */
    public List<List<Integer>> threeSum2(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length < 3) return result;
        //先排序，避免出现相同三元组不同顺序情况，便于去重
        Arrays.sort(numbers);
        //不重复的三元组：使用set泛型存储三元组保证去重
        Set<List<Integer>> threeSet = new HashSet<>();
        for (int i = 0; i < numbers.length - 2; i++) {
            //1.数组排序后比遍历，如果当前元素 > 0 ，则数组后边元素无法满足，直接结束循环
            if (numbers[i] > 0) break;
            //2.先固定一个值a(number[i])，再通过左右双指针寻找满足 a + b + c = 0 条件的 b 和 c
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                if (numbers[i] + numbers[left] + numbers[right] == 0) {  //满足三元组情况
                    threeSet.add(new ArrayList<>(Arrays.asList(numbers[i], numbers[left], numbers[right])));
                    //找到三元组，左右指针移动到下一位
                    left++;
                    right--;
                } else if (numbers[i] + numbers[left] + numbers[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        result = new ArrayList<>(threeSet);
        return result;
    }


    /**
     * 三数之和 优化(排序+双指针+条件判断去重)
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
     * 注意：答案中不可以包含重复的三元组。
     * 时间复杂度 T(N) = O(n^2)
     * 空间复杂度 O(N) = O(1)
     */
    public List<List<Integer>> threeSum3(int[] numbers) {
        // ### 解题思路
        // #### 一、常规思路:
        //        1. 暴力解法, 通过三层循环遍历寻找a,b,c合适的三元组, 三元组去重处理, 时间复杂度O(N^3)
        //        2. 该问题分为2个问题重点:
        //        2.1 如何组成三元组
        //        2.2 如何给三元组去重
        //
        // #### 二、优化思路:（通过双指针降低问题规模 O(N^3) -> O(N^2)）
        //        1. 先对数组进行排序, 排序时间复杂度为 O(NLogN)
        //        2. 二层循环遍历寻找三元组:
        //* 外层循环: 先把a为固定为第i个值 number[i],当number[i] > 0 时, 则已经没有满足三元组情况, 结束循环,当number[i] == number[i-1]时, 重复情况, 循环体 continue
        //* 内层循环: 左右指针寻找, left=i+1, right=numbers.length-1, b=numbers[left], c=numbers[right] 当left>=right时,结束循环
        //        2.1 当a+b+c=0时, 三个数组成三元组 left++, right--
        //        2.2 当a+b+c>0时, 说明右指针c的值过大, 右指针 right--
        //        2.3 当a+b+c<0时, 说明左指针b的值过小, 左指针 left++
        //        3. 三元组去重：
        //        3.1 由于数组已经有序, 满足情况的{a,b,c}出现时, 不会出现{b,a,c}或{c,a,b}等重复三元组
        //        3.2 由于number[i], 寻找出所有满足a+b+c情况的三元组, number[i] == number[i-1], 则不添加重复项,i++
        //        3.3 当2.1情况时, 需要判断left/right指针的下一位置的数是否和当前指针的数相等, 如果是则left++/right--, 循环检查left/right后边的位置, 直到不相等则结束循环
        List<List<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length < 3) return result;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; i++) {
            //1.数组排序后比遍历,如果当前元素 > 0 ,则数组后边元素无法满足，直接结束循环
            if (numbers[i] > 0) break;
            //2.number[i] == number[i - 1] continue; 避免重复（去重1）
            if (i > 0 && numbers[i] == numbers[i - 1]) continue;
            //3.先固定一个值a(number[i]),再通过左右双指针寻找满足 a + b + c = 0 条件的 b 和 c,b=numbers[left],c=numbers[right]
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                if (numbers[i] + numbers[left] + numbers[right] == 0) {  //当a+b+c=0时，三个数组成三元组 left++ right--
                    result.add(new ArrayList<>(Arrays.asList(numbers[i], numbers[left], numbers[right])));
                    left++;
                    right--;
                    //（去重2）
                    //left指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                    while (left < right && numbers[left] == numbers[left - 1]) left++;
                    //right指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                    while (left < right && numbers[right] == numbers[right + 1]) right--;
                } else if (numbers[i] + numbers[left] + numbers[right] < 0) { //当a+b+c<0时，说明左指针b的值过小，左指针 left++
                    left++;
                } else { //当a+b+c>0时，说明右指针c的值过大，右指针 right--
                    right--;
                }
            }
        }
        return result;
    }

    /**
     * 1.两数之和
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 只会存在一个有效答案
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null || numbers.length < 2) return result;
        //HashMap解法
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(target - numbers[i], i);
        }
        Integer temp;
        //通过一层循环遍历HashMap获取符合a+b=target的唯一解
        for (int i = 0; i < numbers.length; i++) {
            temp = map.get(numbers[i]);
            if (temp != null && i != map.get(numbers[i])) {
                result[0] = i;
                result[1] = temp;
                break;
            }
        }
        return result;
    }

    /**
     * 167.有序数组的两数之和（双指针解法）
     * 给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
     * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
     * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSumOrderly1(int[] numbers, int target) {
        //双指针解法
        int[] result = new int[2];
        if (numbers == null || numbers.length < 2) return result;
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                //numbers 的下标 从 1 开始计数，left和right 先+1
                result[0] = ++left;
                result[1] = ++right;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    /**
     * 167.有序数组的两数之和（二分查找解法）
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSumOrderly2(int[] numbers, int target) {
        //二分查找解法
        int[] result = new int[2];
        if (numbers == null || numbers.length < 2) return result;
        int mid;
        for (int i = 0; i < numbers.length; i++) {
            int low = i + 1;
            int high = numbers.length - 1;
            while (low <= high) {
                //求中位数
                mid = (low + high) / 2;
                if (numbers[i] + numbers[mid] == target) {
                    //numbers 的下标 从 1 开始计数，left和right 先+1
                    result[0] = ++i;
                    result[1] = ++mid;
                    break;
                } else if (numbers[i] + numbers[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return result;
    }

    /**
     * 四数之和
     *
     * @param numbers
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length < 4) return result;
        //四数之和转化为动态A的三数之和问题
        //a + b + c + d = target A = a + b => A + c + d = target
        //原三数之和：排序 + 固定a + 双指针left+right寻找满足条件的 b和c
        //动态A的三数之和：排序 + 动态a + 双指针left+right寻找满足条件的 b和c

        Arrays.sort(numbers);
        int dynamicB;  //动态b
        int left;
        int right;
        Set<List<Integer>> singleSet = new HashSet<>();
        //a的数组下标范围(为b,c和d预留3个位置)：[0 <= a < ((numbers.length - 1) - 2)]
        for (int i = 0; i <= ((numbers.length - 1) - 2); i++) {
            dynamicB = i + 1;
            left = dynamicB + 1;
            right = numbers.length - 1;

            //dynamicB的数组下标范围(为c和d预留2个位置)：[0 <= dynamicB < ((numbers.length - 1) - 1)]
            while (dynamicB < ((numbers.length - 1) - 1)) {
                if (left < right) {
                    if ((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) == target) {
                        singleSet.add(new ArrayList<>(Arrays.asList(numbers[i], numbers[dynamicB], numbers[left], numbers[right])));
                        left++;
                        right--;
                        //left指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[left] == numbers[left - 1]) left++;
                        //right指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[right] == numbers[right + 1]) right--;
                    } else if ((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) > target) {
                        right--;
                    } else {
                        left++;
                    }
                } else {
                    //dynamicB的数组下标范围(为c和d预留2个位置)：[0 <= dynamicB < ((numbers.length - 1) - 1)]
                    if (dynamicB == ((numbers.length - 1) - 1)) break;
                    dynamicB++;
                    left = dynamicB + 1;
                    right = numbers.length - 1;
                }
            }
        }
        return new ArrayList<>(singleSet);
    }

    /**
     * 四数之和
     *
     * @param numbers
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum2(int[] numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length < 4) return result;
        //四数之和转化为动态A的三数之和问题
        //a + b + c + d = target A = a + b => A + c + d = target
        //原三数之和：排序 + 固定a + 双指针left+right寻找满足条件的 b和c
        //动态A的三数之和：排序 + 动态a + 双指针left+right寻找满足条件的 b和c

        Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        int dynamicB;  //动态b
        int left;
        int right;
        Set<List<Integer>> singleSet = new HashSet<>();
        //a的数组下标范围(为b,c和d预留3个位置)：[0 <= a < ((numbers.length - 1) - 2)]
        for (int i = 0; i < ((numbers.length - 1) - 2); i++) {
            //剪枝操作
            //1.去重判断，循环直接进入下一轮
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            //2.在确定第一个数之后，如果 nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target 说明此时剩下的三个数无论取什么值，四数之和一定大于target，因此退出循环
            if (numbers[i] + numbers[i + 1] + numbers[i + 2] + numbers[i + 3] > target) {
                break;
            }
            //3.在确定第一个数之后，如果 nums[i]+nums[n−3]+nums[n−2]+nums[n−1]<target 说明此时剩下的三个数无论取什么值，四数之和一定小于target，因此循环直接进入下一轮
            if (numbers[i] + numbers[numbers.length - 3] + numbers[numbers.length - 2] + numbers[numbers.length - 1] < target) {
                continue;
            }

            dynamicB = i + 1;
            left = dynamicB + 1;
            right = numbers.length - 1;

            //dynamicB的数组下标范围(为c和d预留2个位置)：[0 <= dynamicB < ((numbers.length - 1) - 1)]
            while (dynamicB < ((numbers.length - 1) - 1)) {
                //剪枝操作
                //1.去重判断，循环直接进入下一轮
                if (dynamicB > i + 1 && numbers[dynamicB] == numbers[dynamicB - 1]) {
                    dynamicB++;
                    left = dynamicB + 1;
                    right = numbers.length - 1;
                    continue;
                }
                //2.在确定第一个数之后，如果 nums[i]+nums[j]+nums[i+2]+nums[i+3]>target 说明此时剩下的三个数无论取什么值，四数之和一定大于target，因此退出循环；
                if (numbers[i] + numbers[dynamicB] + numbers[dynamicB + 1] + numbers[dynamicB + 2] > target) {
                    break;
                }
                //3.在确定第一个数之后，如果 nums[i]+nums[j]+nums[n−2]+nums[n−1]<target 说明此时剩下的三个数无论取什么值，四数之和一定小于target，因此循环直接进入下一轮；
                if (numbers[i] + numbers[dynamicB] + numbers[numbers.length - 2] + numbers[numbers.length - 1] < target) {
                    dynamicB++;
                    left = dynamicB + 1;
                    right = numbers.length - 1;
                    continue;
                }
                if (left < right) {
                    if ((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) == target) {
                        singleSet.add(new ArrayList<>(Arrays.asList(numbers[i], numbers[dynamicB], numbers[left], numbers[right])));
                        left++;
                        right--;
                        //left指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[left] == numbers[left - 1]) left++;
                        //right指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[right] == numbers[right + 1]) right--;
                    } else if ((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) > target) {
                        right--;
                    } else {
                        left++;
                    }
                } else {
                    //dynamicB的数组下标范围(为c和d预留2个位置)：[0 <= dynamicB < ((numbers.length - 1) - 1)]
                    if (dynamicB == ((numbers.length - 1) - 1)) break;
                    dynamicB++;
                    left = dynamicB + 1;
                    right = numbers.length - 1;
                }
            }
        }
        return new ArrayList<>(singleSet);
    }


    /**
     * 75.颜色分类（双指针解法）
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        //数组为空，数组1个元素，直接返回
        if (nums == null || nums.length <= 1) return;
        //左右指针分别从数组的左右2边开始遍历
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            //当数组i坐标元素为0（红色）
            if (nums[i] == 0 && left < i) {
                //循环控制数组左指针数组下标值不为0时，记录左指针，作为替换元素
                while (nums[left] == 0 && left < i) {
                    left++;
                }
                //交换左指针和i的数组下标值
                swap(nums, i, left++);

                //如果交换后i坐标的元素为2（蓝色）
                if (nums[i] == 2 && right > i) {
                    //循环控制数组右指针的数组下标值不为2时，结束循环，记录右指针，作为替换元素
                    while (nums[right] == 2 && right > i) {
                        right--;
                    }
                    //交换右指针和i的数组下标值
                    swap(nums, i, right--);
                }
            }
            //当数组i坐标元素为2（蓝色）
            else if (nums[i] == 2 && right > i) {
                //循环控制数组右指针的数组下标值不为2时，结束循环，记录右指针，作为替换元素
                while (nums[right] == 2 && right > i) {
                    right--;
                }
                //交换右指针和i的数组下标值
                swap(nums, i, right--);

                //如果交换后i坐标的元素为0（红色）
                if (nums[i] == 0 && left < i) {
                    //循环控制数组左指针数组下标值不为0时，记录左指针，作为替换元素
                    while (nums[left] == 0 && left < i) {
                        left++;
                    }
                    //交换左指针和i的数组下标值
                    swap(nums, i, left++);
                }
            }
            System.out.println("test left:" + left + " right:" + right + " " + Arrays.toString(nums));
        }

    }


    /**
     * 75.颜色分类（刷漆解法）
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     *
     * @param nums
     */
    public void sortColors2(int[] nums) {
        //刷漆法解题思路：（通过 num < 2 和 num < 1 这2个条件来划分0和1的区域，当满足num < 1时，同时也满足num < 2）
        //1.把数组全部元素刷为2
        //2.把 num < 2 的所有元素全部刷为1
        //3.把 num < 1 的所有元素全部刷为0
        //4.遍历结束，0,1,2所有元素就是按照顺序依次排列了。
        //22222222 -> 11111222 -> 00111222

        //数组为空，数组1个元素，直接返回
        if (nums == null || nums.length <= 1) return;
        //记录0出现的次数
        int sum0 = 0;
        //记录1出现的次数
        int sum1 = 0;
        //当前数组下标的值
        int currentNum;
        for (int i = 0; i < nums.length; i++) {
            //记录当前下标的值
            currentNum = nums[i];
            //把数组当前下标的元素先更新为2
            nums[i] = 2;
            //当满足 currentNum < 2时，则currentNum为 1 或 0
            if (currentNum < 2) {
                nums[sum1++] = 1;
            }
            //当满足 currentNum < 1时，则currentNum可为 0
            if (currentNum < 1) {
                nums[sum0++] = 0;
            }
        }
    }

    /**
     * 75.颜色分类（双指针解法-优化代码行数）
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     *
     * @param nums
     */
    public void sortColors3(int[] nums) {
        //数组为空，数组1个元素，直接返回
        if (nums == null || nums.length <= 1) return;
        //左右指针分别从数组的左右2边开始遍历
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i <= right; i++) {
            //当数组i坐标元素为0
            if (nums[i] == 0) {
                //交换左指针和i的数组下标值
                swap(nums, i, left++);
            }
            if (nums[i] == 2) {
                //交换右指针和i的数组下标值
                swap(nums, i, right--);
                //如果交换后的数值不是1，i--回退
                if (nums[i] != 1) {
                    i--;
                }
            }
        }
    }

    /**
     * 交换数组中2个下标的元素
     *
     * @param nums
     * @param i
     * @param j
     */
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    /**
     * 125. 验证回文串
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     * 双指针解法
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s != null && s.length() == 0) return true;
        //先把字符串s全部转换为小写
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        //双指针分别指向字符串的前后两端
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            //因为忽略只考虑字母和数字字符,所以字符数组遍历的过程中，通过字符的ASCII来判断左右指针的位置
            //当前左指针指向的字符是非字母或非数字的，则左指针右移
            while (left < right && !((charArray[left] >= 'a' && charArray[left] <= 'z') || (charArray[left] >= '0' && charArray[left] <= '9'))) {
                left++;
            }
            //当前右指针指向的字符是非字母或非数字的，则右指针左移
            while (left < right && !((charArray[right] >= 'a' && charArray[right] <= 'z') || (charArray[right] >= '0' && charArray[right] <= '9'))) {
                right--;
            }
            //比较左右指针指向字符，如果不同则非回文串
            if (charArray[left] != charArray[right]) {
                return false;
            }
            //左右指针指向字符，比较后结果相等
            //左指针右移，右指针左移，循环继续遍历，比较下一个字符
            left++;
            right--;
        }
        //循环遍历结束，无非回文串的情况，则是回文串
        return true;
    }


    /**
     * 125. 验证回文串
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     * StringBuilder过滤字符解法
     *
     * @param s
     * @return
     */
    public boolean isPalindrome2(String s) {
        if (s == null) return false;
        if (s != null && s.length() == 0) return true;
        // StringBuilder 效率大于 StringBuffer
        StringBuilder stringBuffer = new StringBuilder();
        //过滤字符串，得到新字符串，只包含字母和数字，并且字母统一小写
        //通过Character.isLetterOrDigit()匹配是否属于字母和数字
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuffer.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder reverseStringBuffer = new StringBuilder(stringBuffer).reverse();
        return stringBuffer.toString().equals(reverseStringBuffer.toString());
    }


    /**
     * 125. 验证回文串
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     * StringBuilder过滤字符解法
     *
     * @param s
     * @return
     */
    public boolean isPalindrome3(String s) {
        if (s == null) return false;
        if (s != null && s.length() == 0) return true;
        // StringBuilder 效率大于 StringBuffer
        StringBuilder stringBuffer = new StringBuilder();
        //过滤构成新字符串：只包含字母和数字，并且字母统一小写
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                //大写字符转换为小写字母（ASCII规则）
                stringBuffer.append((char) (s.charAt(i) + 32));
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                stringBuffer.append(s.charAt(i));
            }
        }
        StringBuilder reverseStringBuffer = new StringBuilder(stringBuffer).reverse();
        return stringBuffer.toString().equals(reverseStringBuffer.toString());
    }

    /**
     * 回溯法 + 双指针判断回文串
     *
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(String value, int startIndex, ArrayList<String> path, List<List<String>> result) {
        //递归的结束条件（startIndex -> value.length()）
        if (startIndex == value.length()) {
            result.add(new ArrayList<>(path));
            System.out.println("result => " + result.toString());
            return;
        }
        //通过StringBuilder获取每次截断的字符串
        StringBuilder builder = new StringBuilder();
        //startIndex为切割线，每次递归遍历时的起始位置
        for (int i = startIndex; i < value.length(); i++) {
            builder.append(value.charAt(i));
            //判断是否回文串，否则更新为下一个切割线
            if (!isPalindromeString(builder.toString())) {
                System.out.println("非回文 continue => " + builder.toString());
                continue;
            }
            //add符合回文要求的子串
            path.add(builder.toString());
            System.out.println("  截取元素 => " + path.get(path.size() - 1));
            System.out.println("  递归之前 => " + path);
            // 寻找i+1为起始位置的子串
            backtrack(value, i + 1, path, result);
            //回溯过程，弹出本次已经填入的子串（remove掉数组尾部元素）
            System.out.println("回退元素 => " + path.get(path.size() - 1));
            path.remove(path.size() - 1);
            System.out.println("递归之后 => " + path);
        }
    }


    /**
     * 已知字符串只有小写字母，判断是否回文串（双指针）
     *
     * @param value
     * @return
     */
    public boolean isPalindromeString(String value) {
        if (value == null) return false;
        if (value != null && value.length() == 0) return true;
        int left = 0;
        int right = value.length() - 1;
        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    /**
     * 回溯法 + 动态规划预处理回文串状态
     *
     * @param s
     * @return
     */
    public List<List<String>> partition2(String s) {
        List<List<String>> result = new ArrayList<>();
        //因为回溯寻找全部解的过程都是尾部插入和删除的，所以使用LinkedList的Deque的栈接口，方便末尾插入和删除
        LinkedList<String> path = new LinkedList<>();

        //动态规划方案预处理回文串的状态数组（空间换时间）
        boolean[][] dp = new boolean[s.length()][s.length()];
        //dp初始化
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i], true);
        }
        //dp的赋值
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                //f(i,j) 表示 s[i..j]s[i..j] 是否为回文串，求得状态转移方程：F[i][j] = (s[i] == s[j]) && F[i + 1][j - 1]
                //dp状态数组记录
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
            }
        }
        backtrack2(s, 0, dp, path, result);
        return result;
    }

    public void backtrack2(String value, int startIndex, boolean[][] dp, LinkedList<String> path, List<List<String>> result) {
        //递归的结束条件（startIndex -> value.length()）
        if (startIndex == value.length()) {
            result.add(new ArrayList<>(path));
//            System.out.println("result => " + result.toString());
            return;
        }
        //通过StringBuilder获取每次截断的字符串
        StringBuilder builder = new StringBuilder();
        //startIndex为切割线，每次递归遍历时的起始位置
        for (int i = startIndex; i < value.length(); i++) {
            builder.append(value.charAt(i));
            if (!dp[startIndex][i]) {
//                System.out.println("非回文 continue => " + builder.toString());
                continue;
            }
            //add符合回文要求的子串
            path.addLast(builder.toString());
//            System.out.println("  截取元素 => " + path.get(path.size() - 1));
//            System.out.println("  递归之前 => " + path);
            // 寻找i+1为起始位置的子串
            backtrack2(value, i + 1, dp, path, result);
            //回溯过程，弹出本次已经填入的子串（remove掉数组尾部元素）
//            System.out.println("回退元素 => " + path.get(path.size() - 1));
            path.removeLast();
//            System.out.println("递归之后 => " + path);
        }
    }


    /**
     * 回溯法 + 动态规划记忆化搜索
     *
     * @param s
     * @return
     */
    public List<List<String>> partition3(String s) {
        List<List<String>> result = new ArrayList<>();
        //因为回溯寻找全部解的过程都是尾部插入和删除的，所以使用LinkedList的Deque的栈接口，方便末尾插入和删除
        LinkedList<String> path = new LinkedList<>();
        //动态规划方案回文串的状态数组（空间换时间）
        int[][] dp = new int[s.length()][s.length()];
        backtrack3(s, 0, dp, path, result);
        return result;
    }

    public void backtrack3(String value, int startIndex, int[][] dp, LinkedList<String> path, List<List<String>> result) {
        //递归的结束条件（startIndex -> value.length()）
        if (startIndex == value.length()) {
            result.add(new ArrayList<>(path));
//            System.out.println("result => " + result.toString());
            return;
        }
        //startIndex为切割线，每次递归遍历时的起始位置
        for (int i = startIndex; i < value.length(); i++) {
            if (isPalindromeString3(value, dp, startIndex, i) == 1) {
                //尾部添加子串
                path.addLast(value.substring(startIndex, i + 1));
                System.out.println(" 截取元素 => " + path.get(path.size() - 1));
                System.out.println(" 递归之前 => " + path);
                // 寻找i+1为起始位置的子串是否包含回文串
                backtrack3(value, i + 1, dp, path, result);
                System.out.println("回退元素 => " + path.get(path.size() - 1));
                //回溯状态重置（回到递归树的上一个结点继续遍历其他子结点）（remove尾部元素）
                path.removeLast();
                System.out.println("递归之后 => " + path);
            }
        }
    }

    /**
     * 判断是否回文串（递归记忆法搜索）
     *
     * @param value
     * @return
     */
    public int isPalindromeString3(String value, int[][] dp, int i, int j) {
        // 记忆化搜索中，f[i][j] = 0 表示未搜索，1 表示是回文串，-1 表示不是回文串
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        if (i >= j) {
            dp[i][j] = 1;
        } else if (value.charAt(i) == value.charAt(j)) {
            dp[i][j] = isPalindromeString3(value, dp, i + 1, j - 1);
        } else {
            dp[i][j] = -1;
        }
        return dp[i][j];
    }


    /**
     * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0，F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n < 2) return n;
        //动态规划问题求解
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            //F(i) = F(i - 1) + F(i - 2)
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0，F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
     *
     * @param n
     * @return
     */
    public int fib2(int n) {
        if (n < 2) return n;
        //F(0) = 0
        int a = 0;
        //F(1) = 1
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            //F(i) = F(i - 1) + F(i - 2)
            sum = a + b;
            if (i == n) break;
            //F(i - 2) = F(i - 1)
            a = b;
            //F(i - 1) = F(i)
            b = sum;
        }
        return sum;
    }

    /**
     * 斐波那契数
     * 递归思路
     *
     * @param n
     * @return
     */
    public int fib3(int n) {
        if (n < 2) return n;
        //递归思路
        return fib3(n - 1) + fib3(n - 2);
    }

    /**
     * 70. 爬楼梯
     * 动态规划（优化空间复杂度）
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        //列举n = 1,2,3,4,5,6,7... F(n) = ? 寻找规律
        if (n <= 2) return n;
        //动态规划dp
        int[] dp = new int[n + 1];
        //dp初始化 n = 0,1,2
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        //循环由前向后遍历 i从3开始遍历
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 70. 爬楼梯
     * 递归记忆法
     *
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        //递归解法-记忆化优化
        //缓存dp数组，优化在递归过程中重复项只是使用dp[i]
        int[] dp = new int[n + 1];
        return climbStairsDP(n, dp);
    }

    public int climbStairsDP(int n, int[] dp) {
        //递归结束条件
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n == 1) {
            dp[n] = 1;
        } else if (n == 2) {
            dp[n] = 2;
        } else {
            dp[n] = climbStairsDP(n - 1, dp) + climbStairsDP(n - 2, dp);
        }
        return dp[n];
    }


    public void reverseString(char[] s) {
        System.out.println("old:" + Arrays.toString(s));
        if (s == null || s.length == 0) return;
        //字符数组双指针交换元素位置
        int start = 0;
        int end = s.length - 1;
        char temp;
        while (start < end) {
            temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
        System.out.println("new:" + Arrays.toString(s));
    }


    /**
     * 541. 反转字符串 II
     * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     *
     * @param s s
     * @param k k
     * @return return
     */
    public String reverseStr(String s, int k) {
        if (s == null || s.length() < 2 || k == 1) return s;
        System.out.println("old:" + s + " length:" + s.length());
        char[] charArray = s.toCharArray();
        //字符串总长度 < 2k
        if (charArray.length < (2 * k)) {
            if ((charArray.length) >= k) {  //(charArray.length >= k):字符总长度>=k，反转前k个字符，其余字符不变
                reverseIndex(charArray, 0, k - 1);
            } else { //(charArray.length < k):字符总长度<k，字符全部反转
                reverseIndex(charArray, 0, charArray.length - 1);
            }
            return String.valueOf(charArray);
        }
        //字符串总长度 >= 2k
        int start = 0;
        for (int i = 0; i < charArray.length; i++) {
            //每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符
            if ((i + 1) % (2 * k) == 0) {
                //反转这2k字符中的前k个字符
                reverseIndex(charArray, start, start + (k - 1));
                //start更新为下一个位置
                start = i + 1;

                //剩余字符数量: (charArray.length - start)
                if ((charArray.length - start) < (2 * k)) {
                    if ((charArray.length - start) >= k) { //如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
                        reverseIndex(charArray, start, start + (k - 1));
                    } else { //(((charArray.length - start) < k))如果剩余字符少于k个，则将剩余字符全部反转。
                        reverseIndex(charArray, start, charArray.length - 1);
                    }
                    break;
                }
            }
        }
        System.out.println("new:" + String.valueOf(charArray));
        return String.valueOf(charArray);
    }

    /**
     * 反转下标的字符串
     * 优化：时间复杂度O(n/end-start) 空间复杂度 O(1)
     */
    public void reverseIndex(char[] charArray, int start, int end) {
//        System.out.println("reverseIndex-charArray:"+Arrays.toString(charArray) + " start:" + start + " end:" + end);
        if (charArray == null || charArray.length < 2) return;
        char temp;
        while (start < end) {
            temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
    }


    /**
     * 541. 反转字符串 II
     * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     * 优化：时间复杂度T(n) = O(n/2k) * O(k/2) = O(n*k / 2k^2) = O(n/4) = O(n)
     *
     * @param s
     * @param k
     * @return
     */
    public String reverseStr2(String s, int k) {
        if (s == null || s.length() < 2 || k == 1) return s;
        System.out.println("old:" + s + " length:" + s.length());
        int length = s.length();
        char[] charArray = s.toCharArray();
        //i作为循环起始变量，i间隔为2K（每计数至2k个字符，就反转这2k字符中的前k个字符）
        //时间复杂度O(n/2k) 空间复杂度 O(1)
        for (int i = 0; i < length; i += 2 * k) {
            //剩余字符长度：(length - i)
            if ((length - i) >= k) { //剩余字符大于k个，反转前k个字符，其余字符保持原样
                reverseIndex2(charArray, i, (i + k) - 1);
            } else { //剩余字符少于k个，剩余字符全部反转。
                reverseIndex2(charArray, i, length - 1);
            }
        }
        System.out.println("new:" + String.valueOf(charArray));
        return String.valueOf(charArray);
    }

    /**
     * 反转下标的字符串2
     * 优化：时间复杂度O(k/2) 空间复杂度 O(1)
     */
    public void reverseIndex2(char[] charArray, int start, int end) {
//        System.out.println("reverseIndex-charArray:"+Arrays.toString(charArray) + " start:" + start + " end:" + end);
        if (charArray == null || charArray.length < 2) return;
        char temp;
        while (start < end) {
            temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
    }


    /**
     * 剑指 Offer 05. 替换空格
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     *
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) return s;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                builder.append("%20");
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

    public String replaceSpace2(String s) {
        if (s == null || s.length() == 0) return s;
        //StringBuilder Api解法
        return s.replaceAll(" ", "%20");
    }

    public String replaceSpace3(String s) {
        if (s == null || s.length() == 0) return s;
        //Char数组替换法
        char[] charArray = new char[s.length() * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                charArray[size++] = '%';
                charArray[size++] = '2';
                charArray[size++] = '0';
            } else {
                charArray[size++] = s.charAt(i);
            }
        }
        return String.valueOf(charArray, 0, size);
    }

    /**
     * 151. 翻转字符串里的单词
     * 给你一个字符串 s ，逐个翻转字符串中的所有 单词 。
     * <p>
     * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
     * 请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
     * 1.输入字符串 s 可以在前面、后面或者单词间包含多余的空格。
     * 2.翻转后单词间应当仅用一个空格分隔。
     * 3.翻转后的字符串中不应包含额外的空格。
     * 4.s包含英文大小写字母、数字和空格 ' '
     * 5.s中 至少存在一个 单词
     * <p>
     * 单指针扫描单词 + 空格处理 + 逻辑剪枝 + 双指针反转
     *
     * @param s s
     * @return return
     */
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        //1.先整体反转字符串字符
        reverseIndexWords(charArray, 0, charArray.length - 1);
        StringBuilder builder = new StringBuilder();

        //扫描单词的下标指针
        int wordIndex = -1;
        //2.再把每个单词单独反转一次
        for (int i = 0; i < charArray.length; i++) {
            //每次新的单词扫描时，当字符非空格时，记录字符下标
            if (charArray[i] != ' ' && wordIndex == -1) {
                wordIndex = i;
            }
            //字符串中末尾单词无空格情况
            if ((i == charArray.length - 1) && (wordIndex != -1)) {
                //反转字符数组末尾单词
                reverseIndexWords(charArray, wordIndex, i);
                //如果builder不是首位则拼接一个空格
                if (builder.length() != 0) {
                    builder.append(' ');
                }
                //拼接反转后的单词
                for (int j = wordIndex; j <= i; j++) {
                    if (charArray[j] != ' ') {
                        builder.append(charArray[j]);
                    }
                }
                break;
            }

            //字符串中每个单词后会连接一个空格
            if ((charArray[i] == ' ') && (wordIndex != -1)) {
                //反转当前扫描的单词
                reverseIndexWords(charArray, wordIndex, i - 1);
                //如果builder不是首位则拼接一个空格
                if (builder.length() != 0) {
                    builder.append(' ');
                }
                //拼接反转后的单词
                for (int j = wordIndex; j < i; j++) {
                    if (charArray[j] != ' ') {
                        builder.append(charArray[j]);
                    }
                }
                wordIndex = -1;
            }
        }
        return builder.toString();
    }

    /**
     * 双指针法反转字符数组位置
     *
     * @param array 数组
     * @param start 反转数组开始下标
     * @param end   反转数组结束下标
     */
    public void reverseIndexWords(char[] array, int start, int end) {
        if (array == null || array.length < 2) return;
        char temp;
        while (start < end) {
            temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }

    /**
     * 151. 翻转字符串里的单词
     *
     * @param s s
     * @return return
     */
    public String reverseWords2(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        //单词起始指针下标
        int wordIndex = -1;
        //1.先整体反转字符串字符
        reverseIndexWords(charArray, 0, charArray.length - 1);
        //2.再把每个单词单独反转一次
        for (int i = 0; i < charArray.length; i++) {
            //每次新的单词扫描时，当字符非空格时，记录字符下标
            if (charArray[i] != ' ' && wordIndex == -1) {
                wordIndex = i;
            }
            //当单词指针存在时：1.扫描到数组末尾 2.扫描到空格字符
            if (((i == charArray.length - 1) || ((charArray[i + 1] == ' '))) && (wordIndex != -1)) {
                //字符数组中的单词反转
                reverseIndexWords(charArray, wordIndex, i);
                //如果builder不是首位则拼接一个空格
                if (builder.length() != 0) {
                    builder.append(' ');
                }
                //拼接反转后的单词
                for (int j = wordIndex; j <= i; j++) {
                    builder.append(charArray[j]);
                    System.out.println("test:" + builder.toString());
                }
                wordIndex = -1;
            }
        }
        System.out.println("reverseWords-result:" + builder.toString());
        return builder.toString();
    }

    /**
     * 151. 翻转字符串里的单词
     *
     * @param s s
     * @return return
     */
    public String reverseWords3(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        //单词起始指针下标
        int wordIndex = -1;
        //1.先整体反转字符串字符
        int start = 0;
        int end = charArray.length - 1;
        char temp;
        while (start < end) {
            temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
        //2.再把每个单词单独反转一次
        for (int i = 0; i < charArray.length; i++) {
            //每次新的单词扫描时，当字符非空格时，记录字符下标
            if (charArray[i] != ' ' && wordIndex == -1) {
                wordIndex = i;
            }
            //当单词指针存在时：
            //1.扫描到数组末尾
            //2.扫描到空格字符
            if (((i == charArray.length - 1) || ((charArray[i + 1] == ' '))) && (wordIndex != -1)) {
                //先拼接空格
                if (builder.length() != 0) {
                    builder.append(' ');
                }
                //再倒序拼接单词
                for (int j = i; j >= wordIndex; j--) {
                    builder.append(charArray[j]);
                    System.out.println("test:" + builder.toString());
                }
                wordIndex = -1;
            }
        }
        System.out.println("reverseWords-result:" + builder.toString());
        return builder.toString();
    }

    /**
     * 151. 翻转字符串里的单词
     * <p>
     * 使用栈的数据结构，先进后出实现单词反转
     *
     * @param s s
     * @return return
     */
    public String reverseWords4(String s) {
//        System.out.println("value:"+s);
        char[] charArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        //单词入栈
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                //扫描单词
                builder.append(charArray[i]);
                //扫描末尾单词后，入栈
                if (i == charArray.length - 1) {
                    stack.push(builder.toString());
                    break;
                }
                //每个单词间隔为空格
                if (charArray[i + 1] == ' ') {
                    stack.push(builder.toString());
                    builder.setLength(0);
                }
            }
        }
        //清空StringBuilder
        builder.setLength(0);
        //出栈
        while (stack.size() > 0) {
            //单词出栈拼接
            builder.append(stack.pop());
            //非末尾单词拼接空格
            if (stack.size() > 0) {
                builder.append(' ');
            }
        }
        System.out.println("result:" + builder.toString());
        return builder.toString();
    }


    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() == 0) return s;
        //时间复杂度：O(n)
        //空间复杂度：O(n)
        //辅助数组，长度为n
        char[] charArray = new char[n];
        //长度为s.length()
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i < n) {
                charArray[i] = s.charAt(i);
            } else {
                builder.append(s.charAt(i));
            }
            if (i == s.length() - 1) {
                builder.append(charArray);
            }
        }
        System.out.println("result:" + builder.toString());
        return builder.toString();
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords2(String s, int n) {
        if (s == null || s.length() == 0) return s;
        StringBuilder builder = new StringBuilder();
        builder.append(s.substring(n));
        builder.append(s.substring(0, n));
        System.out.println("result:" + builder.toString());
        return builder.toString();
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords3(String s, int n) {
        if (s == null || s.length() == 0) return s;
        //简写
        return s.substring(n) + s.substring(0, n);
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords4(String s, int n) {
        if (s == null || s.length() == 0) return s;
        char[] charArray = s.toCharArray();
        //原地算法解决，不申请额外空间
        //1.先反转数组下标n之前的字符
        //2.再反转数组下标n之后的字符
        //3.再整体反转
        reverseLeftWordIndex(charArray, 0, n - 1);
        reverseLeftWordIndex(charArray, n, charArray.length - 1);
        reverseLeftWordIndex(charArray, 0, charArray.length - 1);
        return new String(charArray);
    }

    //反转字符数组中的字符指定下标
    public void reverseLeftWordIndex(char[] array, int start, int end) {
        if (array == null || array.length == 0) return;
        char temp;
        while (start < end) {
            temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }


    /**
     * 28. 实现 strStr()
     * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
     * 示例 1：
     * 输入：haystack = "hello", needle = "ll"
     * 输出：2
     * BF（暴力解法） 368ms
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        //特殊情况处理
        if (haystack == null || needle == null || needle.length() > haystack.length()) return -1;
        if (needle.length() == 0) return 0;

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        //文本串
        for (int i = 0; i < haystackLength - needleLength + 1; i++) {
            int j;
            //模式串
            for (j = 0; j < needleLength; j++) {
                //不符合的情况，直接跳出，文本串指针后移一位
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            //匹配成功
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 28. 实现 strStr()
     * 字符串匹配实现
     * BF（暴力解法-显示回退）1292ms
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr2(String haystack, String needle) {
        //特殊情况处理
        if (haystack == null || needle == null || needle.length() > haystack.length()) return -1;
        if (needle.length() == 0) return 0;

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        int i; //"文本串"匹配指针
        int j; //"模式串"匹配指针

        //"文本串"匹配
        for (i = 0, j = 0; i < haystackLength && j < needleLength; i++) {
            //"模式串"字符匹配相同时，模式串指针右移
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                //不匹配时
                //1.文本串指针 i 指向下一个字符 : i = 0,i = 1,i = 2,i = 3...(连续不匹配，文本串匹配指针前移)
                //2.将 j 重新指向模式串的头部 : j= 0
                i = i - j;
                j = 0;
            }
            //完全匹配成功
            if (j == needleLength) {
                return i - needleLength + 1;
            }
        }
        return -1;
    }

    /**
     * 28. 实现 strStr() => indexOf()
     * 字符串匹配实现
     * KMP解法
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int kmpIndexOf(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() > haystack.length()) return -1;
        if (needle.length() == 0) return 0;
        //KMP解法
        int[] next = new int[needle.length()];
        //求前缀表
        getNext(needle, next);
        //"模式串"匹配指针初始化为0，从头开始匹配
        int needlePointer = 0;
        //外层循环:"文本串"的扫描
        for (int i = 0; i < haystack.length(); i++) {
            //needlePointer: 每个"模式串"最大相等前后缀子串的长度
            //"模式串"每次从needlePointer的位置开始部分匹配，needlePointer = 0时，表示"模式串"从头开始匹配

            //匹配"模式串"当前位置的字符和"文本串"当前位置的字符是否相等，如果不等，继续回退操作，相等则匹配"模式串"和"文本串"的下一个字符
            //内层循环:"模式串"的扫描

            //匹配不相等时，通过前缀表更新"模式串"扫描指针
            while (needlePointer > 0 && haystack.charAt(i) != needle.charAt(needlePointer)) {
                //"模式串"的匹配指针回退，开始重新匹配（部分）
                needlePointer = next[needlePointer - 1];
            }

            //当前扫描字符匹配成功
            if ((needle.charAt(needlePointer) == haystack.charAt(i))) {
                needlePointer++;
            }

            //"模式串"完全匹配成功，返回匹配的初始位置
            if (needlePointer == needle.length()) {
                //匹配成功初始下标 = i当前位置 - "模式串"长度 + 1
                return (i - needle.length() + 1);
            }
        }
        return -1;
    }

    /**
     * KMP算法生成前缀表
     *
     * @param needle
     * @param next
     */
    public void getNext(String needle, int[] next) {
        if (needle == null || needle.length() == 0 || next == null || next.length == 0) return;
        //模式串：待匹配字符串
        //目标串：模式串的所有子集的集合: {"a","aa","aab","aaba","aabaa","aabaaaf"}

        //前缀和后缀概念理解：
        //***前缀子串: 不包含最后一个字符的所有以第一个字符开头的连续子串
        //***后缀子串: 不包含第一个字符的所有以最后一个字符结尾的连续子串
        //1.思考目标串的前缀子串集合
        //2.思考目标串的后缀子串集合
        //3.寻找字符串前缀子串集合和对应的后缀子串集合中字符串的交集元素，取到这些字符串元素中最长的，即为最大相等前后缀子串

        //为什么求前缀表?
        //前缀表具有告诉我们当前位置匹配失败，跳到之前已经匹配过的地方的能力，这样可以大大节省匹配的时间。


        //求"模式串"的前缀表: 记录目标串（每个下标i之前(包括i)的字符串）中，有多大长度的相同前缀和后缀的集合
        //求"模式串"的每个子串中最大相等前后缀的长度
        //例如：模式串 needle = "aabaaf"
        //情况1：当目标串 = "a"
        //    1."目标串"无前缀子串
        //    2."目标串"无后缀子串
        //    3."目标串"最大相等前后缀子串长度 = 0
        //情况2：当目标串 = "aabaa"
        //    1."目标串"的前缀子串集合 = {"a","aa","aab","aaba"}
        //    2."目标串"的后缀子串集合 = {"a","aa","baa","abaa"}
        //    3."目标串"前缀和后缀子串的交集{"a","aa"}，即最大相等前后缀子串="aa" ，它的长度=2

        //求前缀表过程分为4个步骤(code):
        //1.前缀表初始化
        //2.前后缀不同情况(匹配失败，连续回退，更新前缀指针）
        //3.前后缀相同情况(匹配成功)
        //4.更新next数数值

        //双指针
        //前缀指针: prefixIndex
        //后缀指针: suffixIndex

        //含义1："目标串"前缀的位置 (初始化"目标串"前缀为"a",初始化index = 0)
        //含义2："目标串"最长相等前后缀的长度
        int prefixIndex = 0;

        //含义1："目标串"后缀的位置 (初始化"目标串"后缀为"aa",初始化index = 1)
        //含义2：
        int suffixIndex = 1;

        //1.前缀表的初始化 next[0] = 0
        next[0] = 0;
        //外层while:控制next数组记录每个"目标串"的最大相等前后缀的长度
        while (suffixIndex < needle.length()) {
            //2.匹配失败(前后缀不同情况)
            //前缀指针回退后，前缀和后缀还是不同，则连续回退前缀指针
            //内层while:"模式串"中每个"目标串"的前缀子串和后缀子串匹配情况
            while (prefixIndex > 0 && needle.charAt(suffixIndex) != needle.charAt(prefixIndex)) {
                //前缀指针回退
                prefixIndex = next[prefixIndex - 1];
            }
            //3.匹配成功(前后缀相同情况)
            if (needle.charAt(suffixIndex) == needle.charAt(prefixIndex)) {
                prefixIndex++;
            }
            //4.更新next数组，后缀指针位置加1
            next[suffixIndex++] = prefixIndex;
        }
//        System.out.println("nextIndex:"+Arrays.toString(next) + " length:"+ next.length);
    }


    /**
     * 字符串匹配
     * BM算法解题
     */
    public int bmIndexOf(String haystack, String needle) {
        //BM算法实现字符匹配(右后向前匹配)

        //特殊情况处理
        if (haystack == null || needle == null) return -1;
        char[] hayCharArray = haystack.toCharArray();
        char[] neeCharArray = needle.toCharArray();
        //文本串和模式串的长度
        int hayLength = hayCharArray.length;
        int neeLength = neeCharArray.length;
        if (hayLength < neeLength) return -1;
        if (neeLength == 0) return 0;

        //"文本串"匹配指针
        int prefixIndex = neeLength - 1;
        //"模式串"匹配指针
        int patternIndex = neeLength - 1;
        //"文本串"的末尾指针
        int prefixEndIndex = patternIndex;
        //好后缀数组
        char[] goodSuffixArray = null;
        //好后缀长度
        int goodSuffixSum = 0;

        while (patternIndex >= 0) {
            //模式串每轮首次匹配
            if (patternIndex == neeLength - 1) {
                if (hayCharArray[prefixIndex] == neeCharArray[patternIndex]) {
                    goodSuffixArray = new char[++goodSuffixSum];
                    goodSuffixArray[goodSuffixSum - 1] = hayCharArray[prefixIndex];
                } else {
                    //首次匹配，匹配失败，则属于坏字符情况
                    if (prefixEndIndex == hayLength - 1) {
//                        System.out.println("匹配失败");
                        return -1;
                    }
                    int moveCount = getBadSuffixMoveCount(hayCharArray[prefixIndex], neeCharArray, neeLength, goodSuffixSum);
                    prefixEndIndex = Math.min(prefixEndIndex + moveCount, hayLength - 1);
                    prefixIndex = prefixEndIndex;
                    patternIndex = neeLength - 1;
                    continue;
                }
            } else {
                if (hayCharArray[prefixIndex] == neeCharArray[patternIndex]) {
                    //匹配成功，继续添加好后缀数组
                    if (goodSuffixArray != null) {
                        //好后缀数组扩容
                        goodSuffixArray = Arrays.copyOf(goodSuffixArray, ++goodSuffixSum);
                        //更新好后缀
                        goodSuffixArray[goodSuffixSum - 1] = hayCharArray[prefixIndex];
                    }
                } else {
                    //匹配失败，则分情况移动模式串匹配指针，加快匹配速度
                    //1."坏字符"情况
                    //2."好后缀"情况
                    if (prefixEndIndex == hayLength - 1) {
//                        System.out.println("匹配失败");
                        break;
                    }

                    //1.计算"坏字符"移动个数
                    int moveCount = getBadSuffixMoveCount(hayCharArray[prefixIndex], neeCharArray, neeLength, goodSuffixSum);
                    //2.计算"好后缀"移动个数
                    //非头部位置的好后缀子集，直接使用坏字符规则,则goodSuffixMoveCount = 0，max(a,b)走坏字符逻辑
                    int goodSuffixMoveCount = getGoodSuffixMoveCount(neeCharArray, neeLength, goodSuffixArray, goodSuffixSum);
                    //取坏字符和好后缀2个模式中移动较大值做为当前的实际位移
                    prefixEndIndex = Math.min(prefixEndIndex + (Math.max(goodSuffixMoveCount, moveCount)), hayLength - 1);
                    prefixIndex = prefixEndIndex;
                    patternIndex = neeLength - 1;

                    //好后缀重置
                    goodSuffixArray = null;
                    goodSuffixSum = 0;
                    continue;
                }
            }

            //模式串"完全匹配"
            if (neeLength == goodSuffixSum) {
//                System.out.println("匹配成功");
                return prefixIndex;
            }
            patternIndex--;
            prefixIndex--;
        }
        return -1;
    }

    /**
     * 查询坏字符规则时，指针移动数量
     */
    public int getBadSuffixMoveCount(char badChar, char[] needleCharArray, int needleLength, int goodSuffixSum) {
        int badSuffixMoveCount;
        int badendindex = needleLength - 1 - goodSuffixSum; // 右侧优先
        while (badendindex >= 0 && badChar != needleCharArray[badendindex]) {
            badendindex--;
        }
        if (badendindex == -1) { //模式串不存在坏字符,则模式串向右整体移动匹配: 文本串匹配指针向右移动
            badSuffixMoveCount = needleLength - goodSuffixSum;
        } else {
            //模式串根据右侧优先规则，使匹配坏字符的模式串位置和文本串对齐: 文本串匹配指针向右移动
            badSuffixMoveCount = (needleLength - badendindex - 1) - goodSuffixSum;
        }
        return badSuffixMoveCount;
    }

    /**
     * 判断模式串是否含有好后缀
     */
    public boolean getExistGoodSuffix(char[] needleCharArray, int needleLength, char[] goodSuffixArray, int goodSuffixLength) {
        //文本串
        for (int i = 0; i < needleLength - goodSuffixLength + 1; i++) {
            int j;
            //模式串
            for (j = 0; j < goodSuffixLength; j++) {
                //不符合的情况，直接跳出，文本串指针后移一位
                if (needleCharArray[i + j] != goodSuffixArray[j]) {
                    break;
                }
            }
            //匹配成功
            if (j == goodSuffixLength) {
                return true;
            }
        }
        return false;
    }

    /**
     * 反转下标的字符串
     */
    public void reverseArrayIndex(char[] charArray, int start, int end) {
        if (charArray == null || charArray.length < 2) return;
        //双指针反转
        char temp;
        while (start < end) {
            temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
    }

    /**
     * 查找模式串中好后缀的需要滑动的数量
     */
    public int getGoodSuffixMoveCount(char[] needleCharArray, int neeLength, char[] goodSuffixArray, int gooLength) {
        if (goodSuffixArray == null || goodSuffixArray.length == 0) return 0;
        //先反转好后缀数组，和模式串相同方向
        reverseArrayIndex(goodSuffixArray, 0, goodSuffixArray.length - 1);
        int moveCount = 0;
        boolean isExistGoodSuffix = getExistGoodSuffix(needleCharArray, neeLength, goodSuffixArray, gooLength);
        if (isExistGoodSuffix) {
            int j = gooLength - 1;
            //1.如果模式串含有好后缀，无论是中间还是头部可以按照规则进行移动。如果好后缀在模式串中出现多次，则以最右侧的好后缀为基准。
            //模式串完全包含好后缀
            for (int i = neeLength - gooLength - 1; i >= 0; i--) {
                while (j >= 0) {
                    if (needleCharArray[i] != goodSuffixArray[j]) {
                        j = gooLength - 1;
                        break;
                    } else {
                        j--;
                    }
                }
                if (j == -1) {
                    moveCount = neeLength - i - gooLength;
                    return moveCount;
                }
            }
        } else {
            //2.如果模式串头部含有好后缀子串则可以按照规则进行移动，中间部分含有好后缀子串则不可以。
            //模式串头部包含好后缀子集
            int j;
            for (int i = 0; i < neeLength; i++) {
                for (j = gooLength - 1 - i; j >= 0; j--) {
                    if (needleCharArray[i] != goodSuffixArray[j]) {
                        //好后缀不匹配模式串的头部
                        if (i != 0) {
                            if (moveCount != 0) {
                                return neeLength - moveCount;
                            } else {
                                return 0;
                            }
                        }
                    } else {
                        moveCount++;
                        break;
                    }
                }
                if (j == -1) {
                    return neeLength - moveCount;
                }
            }
        }
        return 0;
    }

    /**
     * 459. 重复的子字符串
     * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
     * 输入: "abcabcabcabc"
     * 输出: True
     * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
     *
     * @param s s
     * @return return
     */
    public boolean repeatedSubstringPattern(String s) {
        int[] next = new int[s.length()];
        //数组长度
        int length = next.length;
        //求前缀表
        getNextArray(s, next);
        System.out.println("next: " + Arrays.toString(next));
        //可以由子串重复多次构成的字符串，则字符串的前缀表中最大值一定是next数组的末尾：next[length - 1]
        //1个周期的长度 = 数组长度 - 最长相等前后缀的长度 : int cycle = length - next[length - 1]
        //数组长度整除1个周期长度，则说明整个数组就是这个周期的至少1次的循环: boolean flag = length % cycle == 0
        //字符串的前缀表中next数组末尾的值为0，则说明字符串最大相等前后缀为0，则一定不满足题目要求: next[length - 1] != 0
        return (next[length - 1] != 0) && (length % (length - (next[length - 1])) == 0);
    }

    /**
     * 生成前缀表->next数组
     */
    public void getNextArray(String s, int[] next) {
        if (s == null || s.length() == 0 || next == null || next.length == 0) return;
        char[] charArray = s.toCharArray();
        //1.初始化
        next[0] = 0;
        int prefixIndex = 0;
        int suffixIndex = 1;
        while (suffixIndex < s.length()) {
            while (prefixIndex >= 1 && ((charArray[prefixIndex] != charArray[suffixIndex]))) {
                prefixIndex = next[prefixIndex - 1];
            }
            if (charArray[prefixIndex] == charArray[suffixIndex]) {
                prefixIndex++;
            }
            next[suffixIndex++] = prefixIndex;
        }
    }

    /**
     * 459. 重复的子字符串
     */
    public boolean repeatedSubstringPattern2(String s) {
        //数组长度
        int length = s.length();
        String str = s;
        //滑动窗口思想（暴力解法）
        //假设每次只移动1个字符，移动k次后，k <= length - 1，当移动后的字符串和原字符串匹配时，证明字符串可以由它的一个子串重复多次构成
        while (length > 1) {
            //s == s(除了首位后边的所有字符) + s(首位字符) ：相当于字符串每次把首位字符调整位置到字符串末尾，形成窗口滑动的的样子
            s = s.substring(1) + s.charAt(0);
            //当移动后的字符串和原字符串匹配时
            if (str.equals(s)) return true;
            length--;
        }
        return false;
    }

    /**
     * 459. 重复的子字符串
     */
    public boolean repeatedSubstringPattern3(String s) {
        //避免这种无用的环绕，可以创建一个新的字符串 str = s + s
        String str = s + s;
        //滑动窗口思想

        return str.substring(1, str.length() - 1).contains(s);
    }


    /**
     * 46. 全排列
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     *
     * @param numbers
     * @return
     */
    public List<List<Integer>> permute(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>(); //结果缓存
        LinkedList<Integer> path = new LinkedList<>(); //路径缓存
        if (numbers == null || numbers.length == 0) return result;
        backtrackingPermute(result, path, numbers);
        return result;
    }

    /**
     * 回溯函数
     * 1.通过递归调用backtracking不断去构造每个路径缓存 path（一次递归过程只求得了一个满足条件的路径），在每个path满足条件后，存储结果到结果集。
     * 2.一次递归过程只求得了一个满足条件的路径，因为需要全排列（全部情况），则需要多次递归求多个路径。
     * 3.每次递归结束后，通过path指针回溯撤销来控制下一个路径的根结点，开始下一次递归
     */
    public void backtrackingPermute(List<List<Integer>> result, LinkedList<Integer> path, int[] numbers) {
        //递归的结束条件
        //找到了一个满足条件的路径，存储结果
        if (path.size() == numbers.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int number : numbers) {
            //查看path中是否包含重复元素
            if (path.contains(number)) {
                continue;
            }
            //路径缓存中添加新的单个元素
            path.add(number);
            //递归寻找路径缓存中的下一个元素
            backtrackingPermute(result, path, numbers);
            //指针回退（回溯到上个位置）
            path.removeLast();
        }
    }


    /**
     * 77. 组合
     * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
     *
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> path = new LinkedList<>();
        //回溯算法解题
        //1.初始化numbers
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
//        backtrackingCombine(result, numbers, path, k, 0);
        backtrackingCombineOPT(result, numbers, path, k, 0);
        return result;
    }

    public void backtrackingCombine(List<List<Integer>> result, int[] numbers, Deque<Integer> path, int k, int startIndex) {
        //递归结束条件
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        //递归循环
        for (int i = startIndex; i < numbers.length; i++) {
            //path结点操作
            path.addLast(numbers[i]);
            //递归: 控制树的纵向遍历（向下）
            backtrackingCombine(result, numbers, path, k, (i + 1));
            //结点回溯到上个位置
            path.removeLast();
        }
    }

    /**
     * 优化：通过剪枝法
     *
     * @param result
     * @param numbers
     * @param path
     * @param k
     * @param startIndex
     */
    public void backtrackingCombineOPT(List<List<Integer>> result, int[] numbers, Deque<Integer> path, int k, int startIndex) {
        //递归结束条件
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        //剪枝优化 : 若起始位置之后的元素个数 已经不足 条件要求的k个了，则没有继续搜索的必要了
        //k : path的限定数量
        //path.size(): 当前path的元素个数
        //k - path.size(): path中还需要的元素个数
        //numbers.length : 数组的大小
        //numbers.length - (k - path.size()) : 所需的剩余数组
        //numbers.length - (k - path.size()) + 1 : 所需的剩余数组 + 起始位置
        //int maxEnd = (numbers.length - (k - path.size()) + 1); = 4 - 2 = 2
        //递归循环
        for (int i = startIndex; i < (numbers.length - (k - path.size()) + 1); i++) {
            //path结点操作
            path.addLast(numbers[i]);
            //递归: 控制树的纵向遍历（向下）
            backtrackingCombineOPT(result, numbers, path, k, (i + 1));
            //结点回溯到上个位置
            path.removeLast();
        }
    }


    /**
     * 216. 组合总和 III
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        //回溯算法解题
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        backtrackingCombine3(result, path, numbers, k, 0,n);
        backtrackingCombine3OPT(result, path, numbers, k, 0, n, 0);
        return result;
    }

    private void backtrackingCombine3(List<List<Integer>> result, LinkedList<Integer> path, int[] numbers, int pathTargetSize, int startIndex, int n) {
        if (path.size() == pathTargetSize) {
            //求和
            int addSum = 0;
            for (int i = 0; i < path.size(); i++) {
                addSum += path.get(i);
            }
            //满足条件：所有相加之和为 sum
            if (addSum == n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i < numbers.length; i++) {
            //path结点操作
            path.addLast(numbers[i]);
            //递归: 控制树的纵向遍历（向下）
            backtrackingCombine3(result, path, numbers, pathTargetSize, i + 1, n);
            //结点回溯到上个位置
            path.removeLast();
        }

    }

    private void backtrackingCombine3OPT(List<List<Integer>> result, LinkedList<Integer> path, int[] numbers, int pathTargetSize, int startIndex, int targetSum, int sum) {
        //减枝（当前元素之和已经超过目标值，则提前结束本次递归）
        if (sum > targetSum) {
            return;
        }
        //递归结束条件
        if (path.size() == pathTargetSize) {
            //sum: 当前path的元素之和
            //targetSum: 题目目标和
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
                System.out.println(result.toString());
            }
            return;
        }
        //剪枝(numbers.length - (pathTargetSize - path.size()) + 1)
        for (int i = startIndex; i < (numbers.length - (pathTargetSize - path.size()) + 1); i++) {
            //path结点操作
            path.addLast(numbers[i]);
            //sum加操作
            sum = sum + numbers[i];
            //递归: 控制树的纵向遍历（向下）
            backtrackingCombine3OPT(result, path, numbers, pathTargetSize, i + 1, targetSum, sum);
            //sum回溯操作
            sum = sum - numbers[i];
            //结点回溯到上个位置
            path.removeLast();
        }
    }

    /**
     * 验证回文串
     * * 通过双指针 left和right
     * * left和right最开始分别指向"字符串"的首部和末尾，遍历并比较是否相等
     * * 如果left，right指针对应字符是非数字和字母的，则让对应指针指向下一个位置
     * * 在匹配是否一致时，注意条件必须是大小写字母，如果是数字则直接匹配是否一致
     * * 因为字符串存在大小写，可以使用2种方案:
     * 1. 比较时left和right指向的字符统一转换为大写或小写
     * 2. 可以枚举出left和right指向2个字符的4种情况:
     * * 1.array[left]小写 array[right]大写 : array[left]小写 + 32 = array[right]大写
     * * 2.array[left]大写 array[right]]小写 : array[left]大写 - 32 = array[right]小写
     * * 3.array[left]同大 ： array[left]大写 = array[right]大写
     * * 4.array[left]同小 ： array[left]小写 = array[right]小写
     * * 时间复杂度：O(n)
     * * 空间复杂度：O(1)
     *
     * @param s
     * @return
     */
    public boolean isPalindromeTest(String s) {
        if (s == null) return false;
        if (s != null && s.length() == 0) return true;
        char[] array = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        System.out.println(s);
        while (left < right) {
            //非英文字母和数字情况，left指针右移
            while (left < right && !((array[left] >= 'a' && array[left] <= 'z') || (array[left] >= 'A' && array[left] <= 'Z') || (array[left] >= '0' && array[left] <= '9'))) {
                left++;
            }
            //非英文字母和数字情况，right指针左移
            while (left < right && !((array[right] >= 'a' && array[right] <= 'z') || (array[right] >= 'A' && array[right] <= 'Z') || (array[right] >= '0' && array[right] <= '9'))) {
                right--;
            }
            if (!(((array[left] >= 'a' && array[left] <= 'z' || array[left] >= 'A' && array[left] <= 'Z') && (array[right] >= 'a' && array[right] <= 'z' || array[right] >= 'A' && array[right] <= 'Z') && (array[left] - 32 == array[right] || array[left] + 32 == array[right])) || array[left] == array[right])) {
                System.out.println("不匹配   left:" + left + " array[left]:" + array[left] + " right:" + right + " array[right]:" + array[right]);
                return false;
            } else {
                System.out.println("匹配   left:" + left + " array[left]:" + array[left] + " right:" + right + " array[right]:" + array[right]);
            }
            //left，right指针移动到下一位
            left++;
            right--;
        }
        return true;
    }

    /**
     * 131. 分割回文串
     * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
     *
     * @param s
     * @return
     */
    public List<List<String>> partitionTest(String s) {
        List<List<String>> result = new ArrayList<>();
        //因为回溯寻找全部解的过程都是尾部插入和删除的，所以使用LinkedList的Deque的栈接口，方便末尾插入和删除
        LinkedList<String> path = new LinkedList<>();
        //动态规划方案回文串的状态数组（空间换时间）
        int[][] dp = new int[s.length()][s.length()];
        backtrackingPartition(result, path, s, 0, dp);
        return result;
    }

    public void backtrackingPartition(List<List<String>> result, LinkedList<String> path, String value, int startIndex, int[][] dp) {
        //递归结束条件(startIndex : 切割线)
        if (startIndex == value.length()) {
            result.add(new ArrayList<>(path));
            System.out.println("path==>>" + path);
            return;
        }
        //startIndex为切割线，每次递归遍历时的起始位置
        //for表示树的横向遍历substring(0,1) substring(0,2) substring(0,3)
        for (int i = startIndex; i < value.length(); i++) {
            //是否回文串
            if (isPalindromeStringDP(value, dp, startIndex, i) == 1) {
                //结点操作（切割）
                path.addLast(value.substring(startIndex, i + 1));
                System.out.println("path-add:" + path + " startIndex:" + startIndex + " i:" + i);
                //递归回调表示树的纵向遍历(startIndex代表分割线，startIndex = 0,startIndex = 1,startIndex = 2  当startIndex = value.size()说明分割线到了末尾，是递归结束条件)
                backtrackingPartition(result, path, value, i + 1, dp);
                //结点回溯
                path.removeLast();
            }
        }
    }

    /**
     * 判断是否回文串（递归记忆法搜索）
     *
     * @param value
     * @return
     */
    public int isPalindromeStringDP(String value, int[][] dp, int startIndex, int j) {
        // 记忆化搜索中，f[i][j] = 0 表示未搜索，1 表示是回文串，-1 表示不是回文串
        if (dp[startIndex][j] != 0) {
            return dp[startIndex][j];
        }
        //0:未比较
        //1:是回文
        //2:非回文
        if (startIndex >= j) { //递归的结束条件
            dp[startIndex][j] = 1;
        } else if (value.charAt(startIndex) == value.charAt(j)) {
            dp[startIndex][j] = isPalindromeStringDP(value, dp, startIndex + 1, j - 1);
        } else {
            dp[startIndex][j] = -1;
        }
        return dp[startIndex][j];
    }

    /**
     * 已知字符串只有小写字母，判断是否回文串（双指针）
     *
     * @param value
     * @return
     */
    public boolean isPalindromeStringTest(String value) {
        if (value == null) return false;
        if (value != null && value.length() == 0) return true;
        int left = 0;
        int right = value.length() - 1;
        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    /**
     * 209. 长度最小的子数组
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     */
    public int minSubArrayLen(int target, int[] nums) {
        //BF解法
        int sum;
        int minSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    //minSum：取满足条件长度最小的连续子数组的元素的个数
                    if (minSum == 0 || minSum > (j - i + 1)) {
                        minSum = (j - i + 1);
                    }
                    break;
                }
            }
        }
        return minSum;
    }


    /**
     * 209. 长度最小的子数组
     * 滑动窗口解法
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     */
    public int minSubArrayLen2(int target, int[] nums) {
        //滑动窗口解法
        int result = 0;
        //滑动窗口的起始位置
        int left = 0;
        //滑动窗口的数值之和
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            //求和
            sum += nums[right];
            //当前窗口的和满足情况则进入循环，通过比较选出最小值的和记录下来:
            //1.如果满足while条件，则窗口的left持续右移，sum每次减去窗口左侧元素
            //2.如果不满足while条件，则right++(窗口的结束位置右移)
            while (sum >= target) {
                //result的首次保存
                if (result == 0) result = (right - left + 1);
                //取每次的和最小值记录下来
                result = Math.min((right - left + 1), result);
                //精髓之处: 修改窗口的起始位置
                //left右移，不断修改滑动窗口的起始位置，sum减去滑动窗口最左侧的元素
                sum -= nums[left++];
            }
        }
        return result;
    }


    /**
     * 209. 长度最小的子数组
     * 滑动窗口解法
     * 时间复杂度 O(NLogN)
     * 空间复杂度 O(N)
     */
    public int minSubArrayLen3(int target, int[] nums) {
        //前缀和+二分查找

        //前缀和递增有序
        int result = 0;
        //构造前缀和sums
        int[] sums = new int[nums.length + 1];
        for (int i = 1; i < sums.length; i++) {
            sums[i] = nums[i - 1] + sums[i - 1];
        }
        System.out.println("nums:" + Arrays.toString(nums));
        System.out.println("sums:" + Arrays.toString(sums));
        //sums[index] - sums[i - 1] >= target : k ~ j 是满足的连续子数组
        //sums[i - 1] + target <= sums[index] : 在前缀和中寻找sums[index]
        //(sumTarget = sums[i - 1] + target <= sums[index]) => (sumTarget <= sum[index])
        for (int i = 1; i < sums.length; i++) {
            //因为"前缀和"的递增有序数组，则可以在前缀和中使用二分查找sum[index]，如果不存在则返回插入位置（负数，从1开始计数）
            int index = binarySearchSums(sums, sums[i - 1] + target);
            //插入点处理获取: 因为插入点从1开始开始计数，所以减一
            if (index < 0) {
                index = (-index) - 1;
            }
            if (index < sums.length) {
                if (result == 0) {
                    result = index - (i - 1);
                }
                result = Math.min(result, index - (i - 1));
            }

        }
        return result;
    }

    //二分查找
    private int binarySearchSums(int[] sums, int target) {
        int left = 0;
        int right = sums.length - 1;
        int middle = left + ((right - left) >> 1);
        while (left <= right) {
            middle = left + ((right - left) >> 1);
            if (target > sums[middle]) { //target > sums[middle]，左指针更新为中位数的右边
                left = middle + 1;
            } else if (target < sums[middle]) { //target < sums[middle]，右指针更新为中位数的左边
                right = middle - 1;
            } else {
                return middle;
            }
        }
        System.out.println("left:" + left + " right:" + right + " middle:" + middle);
        //如果未找到该元素，则返回插入点，从1开始计数
        //插入点：索引建将要插入数组的那一点，第一个大于该键的元素索引
        return -(left + 1);
    }


    /**
     * 560. 和为 K 的子数组
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回该数组中和为 k 的连续子数组的个数。
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     */
    public int subarraySum(int[] nums, int k) {
        //暴力枚举
        int sum = 0;
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            sum = 0;
            for (int end = start; end >= 0; end--) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 560. 和为 K 的子数组
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回该数组中和为 k 的连续子数组的个数。
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     */
    public int subarraySum2(int[] nums, int k) {
        //前缀和 + 哈希表优化

        //HashMap以和为key，出现次数为对应的value
        HashMap<Integer, Integer> map = new HashMap<>();
        //计数
        int count = 0;
        //和
        int sum = 0;
        //HashMap初始化
        map.put(0, 1);

        //sums为前缀和 sums[i] = sums[i−1] + nums[i]
        //[j..i]这个子数组和为k :  sums[i] − sums[j−1] == k
        //符合条件的下标j需要满足 : sums[j−1] == sums[i] − k

        for (int i = 0; i < nums.length; i++) {
            //sum:为数组当前下标为i的前缀和
            sum += nums[i];

            //sums[i] - sum[j] = k => sum[j] = sums[i] - k
            //sum[j]存在，并且是满足条件的前缀和
            //获取 sum[j]在HashMap中的value（出现次数） count + 1
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            if (map.get(sum) == null) {
                //初始化
                map.put(sum, 1);
            } else {
                //相同前缀和，value + 1
                map.put(sum, map.get(sum) + 1);
            }
        }
        return count;
    }

    /**
     * 713. 乘积小于K的子数组
     * 暴力枚举
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //已知条件:
        //0 <= k <= 106
        //1 <= nums[i] <= 1000
        int count = 0;
        //暴力枚举
        long multiply; //注意乘积的保存变量不能使用int，长度过大会溢出，需要使用long
        for (int start = 0; start < nums.length; start++) {
            multiply = 1;
            for (int end = start; end < nums.length; end++) {
                multiply *= nums[end];
                if (multiply >= k) {
                    break;
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 713. 乘积小于K的子数组
     * 双指针法(暴力法)
     */
    public int numSubarrayProductLessThanK2(int[] nums, int k) {
        int count = 0;
//        System.out.println("nums:"+Arrays.toString(nums));
        long multiply = 1;
        int left = 0;
        int right = 0;
        while (left < nums.length) {
            multiply = multiply * nums[right];
            if (multiply < k) {
                count++;
//                System.out.println("multiplys:"+multiplys + " left:"+left + " right:"+right);
            } else {
                //滑动窗口起始位置修改，整体向前滑动
                multiply = 1;
                right = ++left;
                continue;
            }
            if (right == nums.length - 1) {
                //滑动窗口起始位置修改，整体向前滑动
                multiply = 1;
                right = ++left;
            } else if (right < nums.length - 1) {
                //滑动窗口起始位置不变，结束位置向右滑动
                right++;
            }
        }
        return count;
    }

    /**
     * 713. 乘积小于K的子数组
     * 滑动窗口解法
     */
    public int numSubarrayProductLessThanK3(int[] nums, int k) {
        //乘积小于k的连续的子数组个数
        if (k <= 1) return 0;
        //滑动窗口解法

        int count = 0;
        int left = 0;
        int right = 0;
        int multiply = 1;

        while (right < nums.length) {
            //multiply:当前窗口[left ~ right]所有数的乘积
            multiply *= nums[right];
            //不满足窗口大小，窗口左指针右移，缩小窗口大小
            while (multiply >= k) {
                multiply /= nums[left++];
            }
            //当前满足条件的连续子数组的子集个数 = right - left + 1
            count += right - left + 1;
            //窗口右指针右移扩大
            right++;
        }
        return count;
    }

    /**
     * 26. 删除有序数组中的重复项
     * 快慢指针思想（写法1）
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        //有序数组
        //快慢指针思想（写法1）

        //index: 比较指针(当前比较元素的位置)
        int index = 0;
        //i: 数组遍历指针
        int i;
        for (i = 1; i < nums.length; i++) {
            //遍历元素和当前比较索引元素不同，则进行覆盖
            if (nums[i] != nums[index]) {
                //在比较元素的下一个位置存入当前num[i]的值
                //更新覆盖 ==>> 覆盖当前比较指针的下一个位置
                nums[++index] = nums[i];
            }
        }
        //新数组的长度 = 最大索引 + 1
        System.out.println(Arrays.toString(nums));
        return index + 1;
    }

    /**
     * 26. 删除有序数组中的重复项
     * 快慢指针思想（写法2）
     *
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        //有序数组
        //快慢指针思想（写法2）
        //数组下标0元素不处理，从下标1开始比较

        //快指针:遍历指针(新元素位置)
        int fastPointer = 1;
        //慢指针:覆盖指针(待覆盖位置)
        int slowPointer = 1;
        while (fastPointer < nums.length) {
            //当前位置元素和前一个位置不同时
            if (nums[fastPointer] != nums[fastPointer - 1]) {
                //更新覆盖 ==>> 覆盖当前慢指针位置
                nums[slowPointer++] = nums[fastPointer];
            }
            //比较盖指针 ==>> 后移到下一个新元素
            fastPointer++;
        }
        System.out.println(Arrays.toString(nums));
        return slowPointer;

    }

    /**
     * 27. 移除元素
     * 双指针-快慢指针
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        //已知数组无序
        //慢指针：覆盖位置
        int slowPointer = 0;
        //快指针：遍历位置
        int quickPointer = 0;
        while (quickPointer < nums.length) {
            if (nums[quickPointer] != val) {
                //覆盖新元素
                nums[slowPointer++] = nums[quickPointer];
            }
            //遍历指针指向下一个元素
            quickPointer++;
        }
        return slowPointer;
    }

    /**
     * 27. 移除元素
     * 双指针-前后替换
     */
    public int removeElement2(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        //已知数组无序
        //左右指针，
        int left = 0;
        int len = nums.length;
        //两者相遇结束循环
        while (left < len) {
            if (nums[left] == val) {
                //左指针元素覆盖右指针元素 -> 右指针左移
                nums[left] = nums[len - 1];
                nums[len - 1] = val;
                len--;
            } else {
                //遍历指针指向下一个元素
                left++;
            }
        }
        return len;
    }


    /**
     * 剑指 Offer 03. 数组中重复的数字
     * 先排序，再寻找相邻
     */
    public int findRepeatNumber(int[] nums) {
        //先对数组进行排序，重复的元素会放在一起
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            //寻找相邻的两个元素是否一样，则为重复元素
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * 剑指 Offer 03. 数组中重复的数字
     * 通过HashMap
     */
    public int findRepeatNumber2(int[] nums) {
        //HashMap解法: key存入数组中的值，通过HashMap.get方法判断是否包含重复元素
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }
        return -1;
    }

    /**
     * 剑指 Offer 03. 数组中重复的数字
     * 通过HashSet
     */
    public int findRepeatNumber3(int[] nums) {
        //HashSet解法: 插入新元素失败，则为重复元素
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
//            if(set.contains(num)){
//                return num;
//            }
//            set.add(num);
        }
        return -1;
    }

    /**
     * 剑指 Offer 03. 数组中重复的数字
     * 通过临时数组
     */
    public int findRepeatNumber4(int[] nums) {
        //临时辅助数组存储记录，默认数组每个值为0
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (temp[nums[i]] == 0) {
                //用数字作为下标，初次赋值为1
                temp[nums[i]] = 1;
            } else {
                //发现重复的值
                return nums[i];
            }
        }
        return -1;
    }


    /**
     * 剑指 Offer 03. 数组中重复的数字
     * 原地交换解法
     */
    public int findRepeatNumber5(int[] nums) {
        System.out.println("nums:" + Arrays.toString(nums) + "\n");
        //原地交换解法（让数组内的值对应下标存放）
        for (int i = 0; i < nums.length; i++) {
            //如果索引正好等于元素本身,位置正确
            if (nums[i] == i) continue;

            int num = nums[i];

            if (nums[num] == num) {
                System.out.println("当前索引为" + num + "的位置已经有" + num + "值重复了");
                return num;
            } else {
                System.out.println("==>> " + "交换元素 " + " nums[" + i + "]:" + nums[i] + " nums[" + num + "]:" + nums[num]);
                //交换元素 nums[i] 和 nums[num] 交换位置 num = nums[i]
                int temp = nums[i];
                nums[i] = nums[num];
                nums[num] = temp;
                System.out.println("==>> " + Arrays.toString(nums) + "\n");
                //交换后仍需遍历当前位置的值，抵消i++
                i--;
            }

        }
        return -1;
    }

    /**
     * 448. 找到所有数组中消失的数字
     *
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //HashSet解法，通过临时空间存储已出现的数字（不重复）

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        //nums[i]在区间[1, n]内 ==>> 遍历1~n
        for (int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }

    /**
     * 448. 找到所有数组中消失的数字
     *
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        //不使用额外空间
        //1.通过调整元素组中数据，把已经出现过的元素对应数字下标的数值变为负数，
        //2.最后通过循环遍历查询数组中所有大于0的数字便是数组中丢失的数字
        List<Integer> result = new ArrayList<>(nums.length);
        int num;
        int index;
        //元素对应的索引，将指定位置元素置为负数
        for (int i = 0; i < nums.length; i++) {
            //当前数组下标的元素: 因为nums在调整后元素会变成负数，所以绝对值取值
            num = Math.abs(nums[i]);
            //需要调整的索引位置 = 当前数字 - 1
            //例: 当前数字3，则数字3的调整的索引位置 = 3 - 1 = 2  ==>> num[2] = -num[2]
            index = num - 1;
            //如果这个数是正数，则将对应索引位置的值设置为负数
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                //元素 = 数组下标 + 1
                result.add(i + 1);
            }
        }
        return result;
    }

    /**
     * 剑指 Offer 22. 链表中倒数第k个结点
     * 先求链表总长度，再通过遍历取倒数K个结点
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        int length = 0;
        //先求链表的总长度
        ListNode temp = head;
        while (temp.next != null){
            length ++;
            temp = temp.next;
        }
        //因为链表最后一个结点的next为空，所以未计数最后一个结点的数量
        //所以链表总长度 length = length + 1
        length = length + 1;
        //再求对应位置的结点(倒数第k个结点:从头遍历的第(length - k)个结点
        temp = head;
        for (int i = 1; i <= length - k; i++) {
            temp = temp.next;
        }
        System.out.println("链表长度为-length:"+length);
        return temp;
    }

    /**
     * 剑指 Offer 22. 链表中倒数第k个结点
     * 通过双指针-快慢指针
     */
    public ListNode getKthFromEnd2(ListNode head, int k) {
        //双指针-快慢指针
        ListNode slow = head;
        ListNode fast = head;

        //1.先找到正数的第k个结点 ==>> fast指针指向该结点
        //i初始化为1: fast最开始已经指向第1位,
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        //2.fast slow 同步向后遍历，当fast的next为null时，结束循环
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
            System.out.println("slow移动到: " + slow.val + " fast移动到: "+ fast.val);
        }
        //此时slow指针指向的是 倒数第k个结点
        return slow;
    }

    /**
     * 剑指 Offer 22. 链表中倒数第k个结点
     * 通过转换list顺序存储，下标获取
     */
    public ListNode getKthFromEnd3(ListNode head, int k) {
        //链表转换list，变为顺序存储，下标获取
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() - k);
    }

    /**
     * 剑指 Offer 22. 链表中倒数第k个结点
     * 双指针-快慢指针-一个for循环
     */
    public ListNode getKthFromEnd4(ListNode head, int k) {
        //双指针-快慢指针-一个for循环

        //快慢指针
        ListNode slow = head;
        ListNode fast = head;
        //统计快指针遍历数量
        int count = 0;
        while(fast != null){
            if(count >= k){
                slow = slow.next;
            }
            fast = fast.next;
            count++;
        }
        if(count < k){
            return null;
        }
        return slow;
    }

    /**
     * 剑指 Offer 22. 链表中倒数第k个结点
     * 递归思想
     */
    //size记录递归返回的次数
    private int size = 0;
    private boolean flag = false;
    private ListNode getKthFromEnd5(ListNode head, int k){
        //递归的结束条件 触链表底(head == null)
        if(head == null){
            return null;
        }
        ListNode node = getKthFromEnd5(head.next,k);
        //已经找到结点，结束剩余递归每层的函数
        if(flag) return node;

        //递归到最后一个链表结点时，触底反弹，返回上一层递归函数
        //每返回上一层，都计数一次
        size++;
        //当返回第k次递归栈时
        if(size == k){
            //找到目标结点并设置标识，优化不同递归层级函数调用多余逻辑
            flag = true;
            return head;
        }
        return node;
    }

    /**
     * 206. 反转链表
     * List解法
     */
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        // 生成链表的根结点(头结点) ==>> root.data = array[0]
        ListNode root = new ListNode(list.get(list.size() - 1));
        //pre(前一个结点)为根结点(临时结点)
        ListNode pre = root;

        //创建新链表时：前置结点pre初始化为头结点，pre不断更新，并且更新pre.next，
        for (int i = list.size() - 2; i >= 0; i--) {
            //创建当前结点
            ListNode node = new ListNode(list.get(i));
            pre.next = node;
            //更新前置结点
            pre = node;
        }
        return root;
    }

    /**
     * 206. 反转链表
     * 双指针解法-原地反转
     */
    public ListNode reverseList2(ListNode head) {
        if(head == null){
            return null;
        }
        //记录前置结点(初始化: 头结点的前置结点为空)
        ListNode pre = null;
        //记录当前结点(初始化: 头结点)
        ListNode cur  = head;
        //在指针引用更改时，会丢失原cur.next结点的引用，需要用临时指针temp记录一下
        ListNode temp;

        //遍历过程中，cur不断更新，并且修改cur.next
        //当cur为空时，遍历结束
        while (cur != null){
            //1.缓存next结点，避免修改链表指向时丢失
            temp = cur.next;
            //2.当前结点修改为反向指向(2->1)
            cur.next = pre;
            //3.前置结点修改为当前结点
            pre = cur;
            //4.当前结点更新为temp结点
            cur = temp;

            //3-4:pre和cur结点都前进一位
        }
        //当遍历到链表最后一个结点时，temp缓存的cur.next为null，所以cur为空，pre更新为cur结点，则pre作为链表反转后的头结点
        return pre;
    }


    /**
     * 206. 反转链表
     * 递归解法
     */
    public ListNode reverseList3(ListNode head) {
        //特殊情况处理
        if(head == null) return null;
        System.out.print("链表->递操作 ==>> ");
        ListNode.print(head);
        //递归的结束条件
        if(head.next == null){
            System.out.println("开始回溯-----------------------");
            return head;
        }
        //递归不断深入，一直到链表的最后一个结点
        //当达到最后一个结点时，return 返回当前结点
        //递归的顺序是由上至下
        //每一次cur返回都是 链表的末尾结点，递归中return的过程就是在给cur结点不断构建新的next，形成新的链表

        ListNode cur = reverseList3(head.next);
        System.out.print("链表->归操作 ==>> ");
        ListNode.print(cur);
        //(head.next)作为参数递归调用的入参
        //head.next: 表示末尾结点
        //head: 表示末尾倒数第2个结点

        //return的顺序:由下至上
        //1.更新末尾结点的next 指向 倒数第2个结点: head.next.next -> head; （反向链接）（5->4）
        head.next.next = head;
        //2.断开原来的链接（末尾倒数第2个结点.next -> 末尾结点 的 链接断开）  链表成环，断开原来的链接（5->4(新链接)  4->5(原来的链接，需要断开)）
        head.next = null;
        //更新head的链接关系后，同步更新cur
        return cur;
    }


    /**
     * 203. 移除链表元素
     * 双指针（单独处理头结点）
     */
    public ListNode removeElements(ListNode head, int val) {
        //删除头结点(单独处理)
        while(head != null && head.val == val){
            head = head.next;
        }
        //头结点删除后为空，则返回
        if(head == null){
            return null;
        }

        //处理非头结点的其他结点
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == val){
                //修改指向（前置结点指向当前结点的next）
                pre.next = cur.next;
            } else {
                //前置结点后移
                pre = cur;
            }
            //遍历下一个结点
            cur = cur.next;
        }
        return head;
    }

    /**
     * 203. 移除链表元素
     * 双指针（临时结点处理头结点）
     */
    public ListNode removeElements2(ListNode head, int val) {
        //建立一个临时的头结点，它的next指向head（辅助删除头结点）
        ListNode temp = new ListNode();
        temp.val = -1;
        temp.next = head;

        //前置结点
        ListNode pre = temp;
        //当前结点
        ListNode cur = head;

        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            //遍历链表下一个结点
            cur = cur.next;
        }
        //临时结点的next就是头结点的结果
        return temp.next;
    }


    /**
     * 203. 移除链表元素
     * 递归解法(反向链接操作)
     */
    public ListNode removeElements3(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements3(head.next,val);
        //例:head: 1->2->3->4->5 删除3
        // 递操作: 从头结点开始递归调用removeElements函数，一直到head.next==null，则到达末尾结点，结束递操作
        // 1 head = 1 head.next = 2
        // 1->2 head = 2 head.next = 3
        // 1->2->3 head = 3 head.next = 4
        // 1->2->3->4 head = 4 head.next = 5
        // 1->2->3->4->5 head = 5 head.next = null
        // 归操作: 从末尾结点开始重新链接链表，组成新的链接关系
        // 先观察head的变化:
        // 5->null
        // 4->5
        // 3->4->5(return head.next)->5
        // 2->4->5(removeElements的返回值为head.next)->5
        // 1->2->4->5
        // 再观察head.next 的变化:
        // 5.next = ?? -> 4.next = ?? -> 3.next = ?? -> 2.next = ?? -> 1.next = ??)
        // 5.next = removeElements(5.next,val) -> 5.next = null
        // 4.next = removeElements(4.next,val) -> 4.next = 5
        // 3.next = removeElements(3.next,val) -> 3.next = 4
        // 2.next = removeElements(2.next,val) -> 2.next = 4
        // 1.next = removeElements(1.next,val) -> 1.next = 2
        // head: 1->2->4->5

        //removeElements的返回值控制新的链表关系
        //if(head.val == val) -> (如果当前结点值等于删除元素的值)，则removeElements的返回值为head.next(需要删除head的值),返回给递归上一层调用
        //if(head.val != val) -> (如果当前结点值不等于删除元素的值)，则removeElements的返回值为head,返回给递归上一层调用
        if(head.next != null) {
            System.out.println("归:" + head.val + "->" + head.next.val);
        }
        //这里的return返回给递归函数的下一个调用（head.next = removeElements3(head.next,val)）
        //递归回溯过程中，不断return操作，上一层函数通过head.next = return ? 更新结点中链表关系，如果需要删除，则return当前节点的next ==>> head.next = return(head.next.next)
        if(head.val == val){
            //head为待删除元素，则返回head.next
            return head.next;
        } else {
            return head;
        }
    }

    /**
     * 把普通数组转化为稀疏数组
     * @param array
     * @return
     */
    public int[][] toSparseArray(int[][] array){
        if(array == null || array[0] == null) return null;


        //1.先求非零元素的个数
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] != 0){
                    count++;
                }
            }
        }
        System.out.println("count:"+count);

        // (n+1)行 3列的二维数组 初始化
        // 总共有3列
        // 第1行放总行数，总列数，总元素个数
        // 第2行开始记录元素 元素行数，元素列数，元素的值

        int[][] result = new int[count + 1][3];
        //初始化第一行
        result[0][0] = array.length;
        result[0][1] = array[0].length;
        result[0][2] = count;
        //稀疏数组的行坐标
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] != 0){
                    index++;
                    result[index][0] = i;
                    result[index][1] = j;
                    result[index][2] = array[i][j];
                }
            }
        }
        return result;
    }

    /**
     * 将稀疏数组转换为普通数组
     * @param array
     * @return
     */
    private int[][] toArray(int[][] array){
        int[][] result = new int[array[0][0]][array[0][1]];
        for (int i = 1; i < array.length; i++) {
            result[array[i][0]][array[i][1]] = array[i][2];
        }
        return result;
    }

    /**
     * 19. 删除链表的倒数第 N 个结点
     * 双指针-快慢指针解法
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //创建临时结点作为头结点
        ListNode temp = new ListNode();
        temp.val = -1;
        temp.next = head;
        //双指针-快慢指针
        //快指针
        ListNode fast = temp;
        //慢指针（相当于当前结点）
        ListNode slow = temp;

        ////记录待删除结点slow的上一结点
        ListNode pre = null;
        //循环遍历快指针正数n个结点
        while (n > 0 && fast != null){
            fast = fast.next;
            n--;
        }
        //当n大于链表的结点数时，无效输入，直接返回head
        if(fast == null) return head;
        //循环遍历快指针，慢指针，并且记录上一个结点
        //当快指针遍历到末尾结点时，慢指针当前的位置就是倒数第N个结点
        while (fast != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        //删除当前结点的链接关系: 上一个结点next指向当前结点的next
        pre.next = slow.next;
        // 删除当前结点的下一个结点链接关系
        slow.next = null;
        //临时结点.next为新的head结点
        return temp.next;
    }


    /**
     * 19. 删除链表的倒数第 N 个结点
     * 双指针-快慢指针解法
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        //创建临时结点作为头结点
        ListNode temp = new ListNode();
        temp.val = -1;
        temp.next = head;

        ListNode fast = temp;
        ListNode slow = temp;
        while(n > 0 && fast != null){
            fast = fast.next;
            n--;
        }
        //如果fast为空，则slow就无法遍历了，直接返回head
        if(fast == null) return head;

        //fast多走1位，让对应的slow少走1位，对应待删除元素的上一位
        fast = fast.next;

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //slow的下一个结点更新为slow的下下个结点
        slow.next = slow.next.next;
        return temp.next;
    }

    //归的次数
    private int count = 0;
    /**
     * 19. 删除链表的倒数第 N 个结点
     * 递归解法
     */
    public ListNode removeNthFromEnd3(ListNode head, int n) {
        //递归函数的结束条件：head结点(当前结点)为空
        if(head == null) {
            return null;
        }
        //链表递归（递操作）
        head.next = removeNthFromEnd(head.next, n);
        //head从尾结点开始（归操作）
        //通过count计数，当count == n时，则表示head结点：倒数n个结点
        if(++count == n){
            return head.next;
        } else {
            return head;
        }
    }

    /**
     * 141. 环形链表
     * 哈希表解法
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        HashSet<ListNode> set = new HashSet<>();
        while (true){
            if(set.contains(head)){
                return true;
            }
            if(head.next == null){
                return false;
            }
            set.add(head);
            head = head.next;
        }
    }

    /**
     * 141. 环形链表
     * 双指针-快慢指针
     */
    public boolean hasCycle2(ListNode head) {
        if(head == null || head.next == null) return false;
        //双指针-快慢指针
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            //无环，fast指针先走到链表的尾部
            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
            //有环
            if(slow == fast) return true;
        }
    }

    /**
     * 142. 环形链表 II
     * 哈希表
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode pos = head;
        HashSet<ListNode> set = new HashSet<>();

        while (true) {
            if(pos == null) return null;
            if (set.contains(pos)) {
                System.out.println("环的入口结点:" + pos.val);
                return pos;
            }
            set.add(pos);
            pos = pos.next;
        }
    }

    /**
     * 142. 环形链表 II
     * 双指针-快慢指针
     */
    public ListNode detectCycle2(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            //没有环时，fast指针先走到链表尾部
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            //快慢指针第一次相遇
            if (slow == fast) break;
        }

        //第一次相遇后，让fast重新指向头结点head，slow保持不变，fast和slow按照相同速度移动，第二次相遇后，此结点即为入口结点
        //环长度已知，相遇点再次走到环入口结点步数 = 环的长度 - 入口结点走到相遇结点的长度
        fast = head;
        while (true) {
            if (slow == fast){
                System.out.println("环的入口结点:" + slow.val);
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
        }
    }


    /**
     * 环形链表 II 求环的长度
     * 方法一：记录环形链表入口位置，遍历环形链表的直到再次相遇入口
     */
    public ListNode detectCycleLength(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            //没有环时，fast指针先走到链表尾部
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            //快慢指针第一次相遇
            if (slow == fast) break;
        }

        //第一次相遇后，让fast重新指向头结点head，slow保持不变，fast和slow按照相同速度移动，第二次相遇后，此结点即为入口结点
        //环长度已知，相遇点再次走到环入口结点步数 = 环的长度 - 入口结点走到相遇结点的长度
        fast = head;
        while (true) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) break;
        }

        //求环的长度（方法1）
        ListNode entranceCircleNode = slow;
        int length = 0;
        while (true){
            if(slow == null){
                return null;
            }
            slow = slow.next;
            length++;
            if(slow == entranceCircleNode){
                System.out.println("环的入口结点:" + slow.val);
                System.out.println("环的长度:" + length);
                break;
            }
        }

        //求环的长度（方法2）
        return entranceCircleNode;
    }

    /**
     * 环形链表 II 求环的长度
     * 方法二：通过快慢指针遍历2次相遇求长度
     */
    public ListNode detectCycleLength2(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        //求环的长度 通过2次相遇所需步数相减而得（方法2）
        //快慢第一次相遇所需要的步数
        int firstLength = 0;
        //快慢指针第二次相遇所需要的步数
        int secondLength = 0;
        int length = 0;
        while (true) {
            //没有环时，fast指针先走到链表尾部
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            length++;
            //快慢指针第一次相遇
            if (slow == fast) {
                if(firstLength == 0){
                    firstLength = length;
                } else {
                    secondLength = length;
                    break;
                }
            }
        }
        System.out.println("环的长度:" + (secondLength - firstLength));
        return slow;
    }


    /**
     * 面试题 02.07. 链表相交
     * 哈希表解法
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //哈希表解法
        ListNode node = headA;
        Set<ListNode> set = new HashSet<>();
        while(node != null){
            set.add(node);
            node = node.next;
        }
        node = headB;
        while(node != null){
            if(set.contains(node)){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    /**
     * 面试题 02.07. 链表相交
     * 双指针解法
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int lengthA = 0;
        int lengthB = 0;
        //求2个链表的长度
        while(nodeA != null){
            lengthA++;
            nodeA = nodeA.next;
        }
        while(nodeB != null){
            lengthB++;
            nodeB = nodeB.next;
        }
        //重置指针
        nodeA = headA;
        nodeB = headB;
        //控制nodeA为最长的链表
        if(lengthB > lengthA){
            //长度交换
            int lengthTemp = lengthA;
            lengthA = lengthB;
            lengthB = lengthTemp;
            //链表交换
            ListNode nodeTemp = nodeA;
            nodeA = nodeB;
            nodeB = nodeTemp;
        }

        //计算长度差值
        int gap = lengthA - lengthB;
        while (gap > 0){
            nodeA = nodeA.next;
            gap--;
        }

        // nodeA 和 nodeB，遇到相同则直接返回
        while(nodeA != null && nodeB != null){
            if(nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }

    /**
     * 24. 两两交换链表中的节点
     * 虚拟头结点，双指针解法
     */
    public ListNode swapPairs(ListNode head) {
        //临时头结点
        ListNode temp = new ListNode();
        temp.val = -1;
        temp.next = head;

        //前一个结点
        ListNode pre = temp;
        //当前结点
        ListNode cur = head;

        while (pre != null && cur != null && cur.next != null) {
            //链表首结点
            ListNode first = pre.next;
            //链表第二个结点
            ListNode second = cur.next;
            //链表第三个结点 交换前两个结点前，先记录第二个结点的next指向的结点
            ListNode third = cur.next.next;

            //前一个结点next指向第二个结点
            pre.next = second;
            //第二个结点next指向第一个结点
            second.next = first;
            //第一个结点next指向之前记录的第三个结点
            first.next = third;

            //pre,cur向前移动2个位置
            if (pre.next != null && pre.next.next != null) {
                pre = pre.next.next;
                cur = pre.next;
            } else {
                pre = null;
                cur = null;
            }
        }
        return temp.next;
    }

    /**
     * 24. 两两交换链表中的节点
     * 虚拟头结点，迭代解法
     */
    public ListNode swapPairs2(ListNode head) {
        //临时头结点
        ListNode temp = new ListNode();
        temp.val = -1;
        temp.next = head;

        //前一个结点
        ListNode pre = temp;
        while (pre.next != null && pre.next.next != null) {
            //链表首结点
            ListNode first = pre.next;
            //链表第二个结点
            ListNode second = pre.next.next;

//          1.temp->first->second
//          2.temp->second->first
            //前一个结点next指向第二个结点
            pre.next = second;
            //第一个结点next指向之前记录的第三个结点
            first.next = second.next;
            //第二个结点next指向第一个结点
            second.next = first;

            //pre向后移动2个位置
            pre = pre.next.next; // pre.next.next == first
        }
        return temp.next;
    }

    /**
     * 24. 两两交换链表中的节点
     * 递归解法
     */
    public ListNode swapPairsDfs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //head表示原始链表的头结点，也表示新链表的第二个结点
        //newHead表示新链表的头结点，也表示原始链表的第二个结点

        //假设原始链表是 1->2->3->4 先记录当前head的next结点
        //  nex = 4
        ListNode nex = head.next;
        // 3.next = null
        head.next = swapPairsDfs(nex.next);
        // 4.next = 3
        nex.next = head;
        return nex;
    }

    /**
     * 24. 两两交换链表中的节点
     * 栈解法
     */
    public ListNode swapPairsStack(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //临时头结点
        ListNode temp = new ListNode();
        temp.val = -1;
        temp.next = head;

        //用stack保存每次迭代的两个节点，运用栈的先进后出原则
        Stack<ListNode> stack = new Stack<>();

        //前一个结点
        ListNode pre = temp;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            //将两个节点放入stack中
            stack.add(cur);
            stack.add(cur.next);
            //当前节点往前走两步
            cur = cur.next.next;

            //2次出栈操作，pre结点指向栈取出的节点，改变链表的链接关系
            //更新pre.next指向
            pre.next = stack.pop();
            //更新pre位置
            pre = pre.next;
            //更新pre.next指向
            pre.next = stack.pop();
            //更新pre位置
            pre = pre.next;
            //完成一次交换
        }

        //更新pre.next
        //当链表长度为奇数时，cur = 末尾结点
        //当链表长度为偶数时，cur = null
        //更新pre.next = cur
        pre.next = cur;
        return temp.next;
    }


    /**
     * 剑指 Offer 25. 合并两个排序的链表
     * 虚拟头结点
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //虚拟头结点
        ListNode temp = new ListNode();
        //从虚拟头结点的next开始链接
        ListNode head = temp;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            //后移
            head = head.next;
        }
        //链接l1或l2的剩余结点
        head.next = ((l1 != null) ? l1 : l2);
        return temp.next;
    }

    /**
     * 剑指 Offer 25. 合并两个排序的链表
     * 递归解法
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
       }
    }

    /**
     * 滑动窗口的最大值
     * 滑动窗口+最大值队列（单调队列）
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        //在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小
        if(nums == null || nums.length < k) return null;
        if((nums != null && nums.length == 0) || k <= 0) return new int[0];
        //最大窗口数量为 nums.length - k + 1
        int[] result = new int[nums.length - k + 1];

        //双端队列记录滑动窗口最大值
        Deque<Integer> maxDeque = new ArrayDeque<>();
        //生成第一个窗口
        for(int i = 0; i < k; i++){
            //maxDeque队列，对头元素时当前的最大值，而其他元素是未来可能成为最大值的候选值
            //  1.新增元素 element > max 时 ，取队列中队尾元素比较，如果满足，进行覆盖并且循环比较直到把所有比它小的值都覆盖为止
            //  2.新增元素 element < max 时，将其存到max队列中去（入队）
            while(!maxDeque.isEmpty() && maxDeque.peekLast() < nums[i]){
                maxDeque.pollLast();
            }
            maxDeque.offerLast(nums[i]);
        }
        //记录第一个滑动窗口的最大值
        result[0] = maxDeque.peekFirst();
        //滑动窗口开始滑动
        for(int i = k; i < nums.length; i++){
            //出队(队头元素 nums[i-k]) ***此时队头的位置不在循环体内
            if(nums[i - k] == maxDeque.peekFirst()){
                //如果删除是最大值，同时从maxDeque中删除
                maxDeque.pollFirst();
            }
            //入队
            while(!maxDeque.isEmpty() && maxDeque.peekLast() < nums[i]){
                maxDeque.pollLast();
            }
            maxDeque.offerLast(nums[i]);
            //记录第(i-k+1)个滑动窗口的最大值
            result[i-k+1] = maxDeque.peekFirst();
        }
        return result;
    }

    /**
     * 104. 二叉树的最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        //递归的结束条件
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        System.out.println("leftDepth:" + leftDepth + "rightDepth:" + rightDepth );
        return Math.max(leftDepth,rightDepth) + 1;
    }
}
