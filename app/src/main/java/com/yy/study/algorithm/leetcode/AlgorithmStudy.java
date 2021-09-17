package com.yy.study.algorithm.leetcode;

import com.yy.study.util.TimeTestUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

        TimeTestUtils.testTask("实现 strStr()", new TimeTestUtils.Task() {
            @Override
            public void execute() {
//                String haystack = "hello world a a  ";
//                String needle = " a  ";
//                String haystack = "hello";
//                String needle = "";
//                String haystack = "";
//                String needle = "";
//                String haystack = "";
//                String needle = "a";
//                String haystack = "aaabc";
//                String needle = "aabc";;


                //KMP算法实现字符串匹配
//                String haystack = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//                String needle = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//                int index = algorithmStudy.strStr(haystack,needle);
//                System.out.println("strStr-index:"+index);

//                String haystack = "aabaabaaf";
//                String needle = "aabaaf";
//                String haystack = "abbababbabbbabababbaabbabaaabbabbbabaabb";
//                String needle =             "abbabbbabaa";

//                String haystack = "ababaabbbbababbaabaaabaabbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbbaabbbabbbaabbbbaaabbababbabbbabababbaabbabababbbaaaaaaababbabaababaabbbbaaabbbabb";
//                String needle = "abbabbbabab";


//                String haystack = "abcccacdcacacc";
//                String needle = "cacdcac";

                //BM算法极端情况
//                String haystack = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//                String needle =   "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";

                //不匹配结束
//                String haystack = "aaaaa";
//                String needle =   "bba";

//                String haystack = "abc";
//                String needle =   "c";
//                String haystack = "ababbbbaaabbbaaa";
//                String needle =   "bbbb";
                String haystack = "babbbbbabb";
                String needle =   "bbab";
//                String haystack = "a";
//                String needle =   "a";

//                int index = algorithmStudy.strStr(haystack,needle);
//                System.out.println("strStr-index:"+index);
//
//                int index2 = algorithmStudy.kmpIndexOf(haystack,needle);
//                System.out.println("kmpIndexOf-index:"+index2);
                int index3 = algorithmStudy.bmIndexOf(haystack,needle);
                System.out.println("bmIndexOf-index:"+index3);
                System.out.println("indexOf-index:"+haystack.indexOf(needle));

                //测试好后缀子集
                char[] needleArray =     {'b','a','b','b','b','b','b','a','b','b'};
                char[] goodSuffixArray = {'b','b','a','b'};

//                char[] needleArray = "babbbbbabb".toCharArray();
//                char[] goodSuffixArray=   "bbab".toCharArray();
//                char[] needleArray = "babbbbbabb".toCharArray();
//                char[] goodSuffixArray = "bbab".toCharArray();
//                int moveSize = algorithmStudy.getGoodSuffixMoveCount(needleArray, goodSuffixArray);
//                System.out.println("moveSize:"+moveSize);
            }
        });

//        TimeTestUtils.testTask("重复的子字符串", new TimeTestUtils.Task() {
//            @Override
//            public void execute() {
//                boolean test1 = algorithmStudy.repeatedSubstringPattern("abcabc");
//            }
//        });
    }


    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 线性时间复杂度，不使用额外空间
     *
     * 解题思路：位运算解决
     * a^a=0；自己和自己异或等于0
     * a^0=a；任何数字和0异或还等于他自己
     * a^b^c=a^c^b；异或运算具有交换律
     * @param numbers
     * @return
     */
    public int singleNumber(int[] numbers){
        int result = 0;
        for(int number : numbers){
            result ^= number;
        }
        return result;
    }

    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 线性时间复杂度，不使用额外空间
     *
     * 解题思路：Set特性解决
     * @param numbers
     * @return
     */
    public int singleNumber2(int[] numbers){
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
     * @param numbers
     * @return
     */
    public int singleNumber3(int[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] ^= numbers[i];
        }
        return numbers[0];
    }

    /**
     * 先排序，再遍历
     * @param numbers
     * @return
     */
    public int singleNumber4(int[] numbers){
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i = i + 2) {
            if(i == numbers.length - 1){
                return numbers[i];
            } else {
                if(numbers[i] != numbers[i+1]){
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
     * @param numbers
     * @return
     */
    public int majorityElement2(int[] numbers) {
        if(numbers.length == 1) return numbers[0];
        Map<Integer,Integer> map = new HashMap<>();
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
     * @param numbers
     * @return
     */
    public int majorityElement3(int[] numbers){
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
            if(candidate1 == number){
                count1++;
                continue;
            }
            //候选人1票数加+1
            if(candidate2 == number){
                count2++;
                continue;
            }
            //候选人1配对
            if(count1 == 0){
                candidate1 = number;
                count1++;
                continue;
            }
            //候选人2配对
            if(count2 == 0){
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
        for(int number: numbers){
            if(candidate1 == number){
                count1++;
            } else if(candidate2 == number){
                count2++;
            }
        }
        if(count1 > (numbers.length / 3)){
            result.add(candidate1);
        }
        if(count2 > (numbers.length / 3)){
            result.add(candidate2);
        }
        return result;
    }

    /**
     * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素
     * 通过哈希表解法
     * @param numbers
     * @return
     */
    public List<Integer> majorityElement1_3_2(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        if(numbers == null || numbers.length == 0) return result;
        //哈希表解法
        Map<Integer,Integer> numberMap = new HashMap<>();
        for(int number: numbers){
            if(numberMap.containsKey(number)){
                numberMap.put(number, numberMap.get(number) + 1);
            } else {
                numberMap.put(number, 1);
            }
        }
        for(int number: numbers){
            if(numberMap.get(number) > (numbers.length / 3)){
                if(!result.contains(number)) result.add(number);
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
        if(matrix == null || matrix.length == 0 ) return false;
        //优化：每行所有元素从左到右升序排列，则先用target查看是否在每一个一维数组的区间内，再二分查找
        for (int[] array : matrix) {
            if(target >= array[0] && target <= array[array.length - 1]){
                if (binarySearch(array, target)) return true;
            }
        }
        return false;
    }

    /**
     * 二分查找
     * 时间复杂度 T(N) = O(LogN)
     * 空间复杂度 S(N) = O(1)
     * @param array 数组
     * @param target 查找数字
     * @return result 是否存在
     */
    public boolean binarySearch(int[] array, int target){
        if(array.length == 1) return array[0] == target;
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end){
            mid = (start + end) / 2; //start + (end - start) 等价 (start + end) / 2
            if(target < array[mid]){
                end = mid - 1;
            } else if(target > array[mid]){
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
        if(matrix == null || matrix.length == 0 ) return false;
        //取行和列的最小值
        int min = Math.min(matrix.length,matrix[0].length);
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
     * @param array 数组
     * @param target 目标数字
     * @param lo 开始的下标（行或列）
     * @param isHorizontal 方向：是否水平方向搜索
     * @return result 是否存在
     */
    public boolean binarySearch2(int[][] array, int target, int lo, boolean isHorizontal){
        //左上角开始搜索
        int start = lo;
        int end = isHorizontal ? array[0].length - 1 : array.length - 1;
        int mid;
        while (start <= end){
            mid = start + (end - start) >> 1;
            if(isHorizontal){  //搜索水平方向（列）
                if(target < array[lo][mid]){
                    end = mid - 1;
                } else if(target > array[lo][mid]){
                    start = mid + 1;
                } else {
                    return true;
                }
            } else { //搜索竖直方向(行)
                if(target < array[mid][lo]){
                    end = mid - 1;
                } else if(target > array[mid][lo]){
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
        if(matrix == null || matrix.length == 0 ) return false;
        //左下角的指针
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length){
            if(matrix[row][col] > target){ //当前指向的值大于目标值，“向上” 移动一行
                row--;
            } else if(matrix[row][col] < target){ //当前指向的值小于目标值，“向右” 移动一列
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
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
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
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        //通过双指针记录两个数组的访问下标，通过轮训不断比较并插入合适的位置
        //归并排序思路：创建一个适合大小的数组，将2个数组按照大小依次放入新数组中完成合并
        if(nums1 == null || nums2 == null)  return;
        if(m == 0 && n == 0)  return;
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int index = 0;
        //2个数组中，其中一个数组长度为0，则结果 = 其中一个数组
        if(m == 0 && n != 0){
            int y = 0;
            while(y < n){
                nums1[index++] = nums2[y++];
            }
            return;
        } else if(n == 0 && m != 0){
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
        while(i < m){
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
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
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
     * @param nums1 有序数组1
     * @param m 数组1的长度
     * @param nums2 有序数组2
     * @param n 数组2的长度
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
     *  时间复杂度 T(N) = O(n^3)
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        if(numbers == null || numbers.length < 3) return result;
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
        if(numbers == null || numbers.length < 3) return result;
        //先排序，避免出现相同三元组不同顺序情况，便于去重
        Arrays.sort(numbers);
        //不重复的三元组：使用set泛型存储三元组保证去重
        Set<List<Integer>> threeSet = new HashSet<>();
        for(int i = 0; i < numbers.length - 2; i++){
            //1.数组排序后比遍历，如果当前元素 > 0 ，则数组后边元素无法满足，直接结束循环
            if(numbers[i] > 0) break;
            //2.先固定一个值a(number[i])，再通过左右双指针寻找满足 a + b + c = 0 条件的 b 和 c
            int left = i + 1;
            int right = numbers.length - 1;
            while(left < right){
                if(numbers[i] + numbers[left] + numbers[right] == 0){  //满足三元组情况
                    threeSet.add(new ArrayList<>(Arrays.asList(numbers[i],numbers[left],numbers[right])));
                    //找到三元组，左右指针移动到下一位
                    left++;
                    right--;
                } else if(numbers[i] + numbers[left] + numbers[right] < 0){
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
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers == null || numbers.length < 2) return result;
        //HashMap解法
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(target - numbers[i],i);
        }
        Integer temp;
        //通过一层循环遍历HashMap获取符合a+b=target的唯一解
        for (int i = 0; i < numbers.length; i++) {
            temp = map.get(numbers[i]);
            if(temp != null && i != map.get(numbers[i])){
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
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSumOrderly1(int[] numbers, int target) {
        //双指针解法
        int[] result = new int[2];
        if(numbers == null || numbers.length < 2) return result;
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                //numbers 的下标 从 1 开始计数，left和right 先+1
                result[0] = ++left;
                result[1] = ++right;
                break;
            } else if(numbers[left] + numbers[right] > target){
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
    /**
     * 167.有序数组的两数之和（二分查找解法）
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSumOrderly2(int[] numbers, int target) {
        //二分查找解法
        int[] result = new int[2];
        if(numbers == null || numbers.length < 2) return result;
        int mid;
        for(int i = 0; i < numbers.length; i++){
            int low = i + 1;
            int high = numbers.length - 1;
            while(low <= high){
                //求中位数
                mid = (low + high) / 2;
                if(numbers[i] + numbers[mid] == target){
                    //numbers 的下标 从 1 开始计数，left和right 先+1
                    result[0] = ++i;
                    result[1] = ++mid;
                    break;
                } else if(numbers[i] + numbers[mid] > target){
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
     * @param numbers
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(numbers == null || numbers.length < 4) return result;
        //四数之和转化为动态A的三数之和问题
        //a + b + c + d = target A = a + b => A + c + d = target
        //原三数之和：排序 + 固定a + 双指针left+right寻找满足条件的 b和c
        //动态A的三数之和：排序 + 动态a + 双指针left+right寻找满足条件的 b和c

        Arrays.sort(numbers);
        int dynamicB;  //动态b
        int left;
        int right;
        Set<List<Integer>> singleSet =  new HashSet<>();
        //a的数组下标范围(为b,c和d预留3个位置)：[0 <= a < ((numbers.length - 1) - 2)]
        for (int i = 0; i <= ((numbers.length - 1) - 2); i++) {
            dynamicB = i + 1;
            left = dynamicB + 1;
            right = numbers.length - 1;

            //dynamicB的数组下标范围(为c和d预留2个位置)：[0 <= dynamicB < ((numbers.length - 1) - 1)]
            while(dynamicB < ((numbers.length - 1) - 1)){
                if(left < right){
                    if((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) == target){
                        singleSet.add(new ArrayList<>(Arrays.asList(numbers[i],numbers[dynamicB],numbers[left],numbers[right])));
                        left++;
                        right--;
                        //left指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[left] == numbers[left - 1]) left++;
                        //right指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[right] == numbers[right + 1]) right--;
                    } else if((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) > target) {
                        right--;
                    } else {
                        left++;
                    }
                } else {
                    //dynamicB的数组下标范围(为c和d预留2个位置)：[0 <= dynamicB < ((numbers.length - 1) - 1)]
                    if(dynamicB == ((numbers.length - 1) - 1)) break;
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
     * @param numbers
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum2(int[] numbers, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(numbers == null || numbers.length < 4) return result;
        //四数之和转化为动态A的三数之和问题
        //a + b + c + d = target A = a + b => A + c + d = target
        //原三数之和：排序 + 固定a + 双指针left+right寻找满足条件的 b和c
        //动态A的三数之和：排序 + 动态a + 双指针left+right寻找满足条件的 b和c

        Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        int dynamicB;  //动态b
        int left;
        int right;
        Set<List<Integer>> singleSet =  new HashSet<>();
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
            while(dynamicB < ((numbers.length - 1) - 1)){
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
                if(left < right){
                    if((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) == target){
                        singleSet.add(new ArrayList<>(Arrays.asList(numbers[i],numbers[dynamicB],numbers[left],numbers[right])));
                        left++;
                        right--;
                        //left指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[left] == numbers[left - 1]) left++;
                        //right指针和下一个位置配对是否相同，循环执行去重复，直到不等，循环结束
                        while (left < right && numbers[right] == numbers[right + 1]) right--;
                    } else if((numbers[i] + numbers[dynamicB] + numbers[left] + numbers[right]) > target) {
                        right--;
                    } else {
                        left++;
                    }
                } else {
                    //dynamicB的数组下标范围(为c和d预留2个位置)：[0 <= dynamicB < ((numbers.length - 1) - 1)]
                    if(dynamicB == ((numbers.length - 1) - 1)) break;
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
     * @param nums
     */
    public void sortColors(int[] nums) {
        //数组为空，数组1个元素，直接返回
        if(nums == null || nums.length <= 1) return;
        //左右指针分别从数组的左右2边开始遍历
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            //当数组i坐标元素为0（红色）
            if(nums[i] == 0 && left < i) {
                //循环控制数组左指针数组下标值不为0时，记录左指针，作为替换元素
                while(nums[left] == 0 && left < i){
                    left++;
                }
                //交换左指针和i的数组下标值
                swap(nums,i,left++);

                //如果交换后i坐标的元素为2（蓝色）
                if(nums[i] == 2 && right > i){
                    //循环控制数组右指针的数组下标值不为2时，结束循环，记录右指针，作为替换元素
                    while(nums[right] == 2 && right > i){
                        right--;
                    }
                    //交换右指针和i的数组下标值
                    swap(nums,i,right--);
                }
            }
            //当数组i坐标元素为2（蓝色）
            else if(nums[i] == 2 && right > i){
                //循环控制数组右指针的数组下标值不为2时，结束循环，记录右指针，作为替换元素
                while(nums[right] == 2 && right > i){
                    right--;
                }
                //交换右指针和i的数组下标值
                swap(nums,i,right--);

                //如果交换后i坐标的元素为0（红色）
                if(nums[i] == 0 && left < i) {
                    //循环控制数组左指针数组下标值不为0时，记录左指针，作为替换元素
                    while(nums[left] == 0 && left < i){
                        left++;
                    }
                    //交换左指针和i的数组下标值
                    swap(nums,i,left++);
                }
            }
            System.out.println("test left:" + left + " right:" + right + " " + Arrays.toString(nums));
        }

    }


    /**
     * 75.颜色分类（刷漆解法）
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
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
        if(nums == null || nums.length <= 1) return;
        //记录0出现的次数
        int sum0 = 0;
        //记录1出现的次数
        int sum1 = 0;
        //当前数组下标的值
        int currentNum;
        for(int i = 0; i < nums.length; i++){
            //记录当前下标的值
            currentNum = nums[i];
            //把数组当前下标的元素先更新为2
            nums[i] = 2;
            //当满足 currentNum < 2时，则currentNum为 1 或 0
            if(currentNum < 2){
                nums[sum1++] = 1;
            }
            //当满足 currentNum < 1时，则currentNum可为 0
            if(currentNum < 1){
                nums[sum0++] = 0;
            }
        }
    }

    /**
     * 75.颜色分类（双指针解法-优化代码行数）
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     * @param nums
     */
    public void sortColors3(int[] nums) {
        //数组为空，数组1个元素，直接返回
        if(nums == null || nums.length <= 1) return;
        //左右指针分别从数组的左右2边开始遍历
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i <= right; i++) {
            //当数组i坐标元素为0
            if(nums[i] == 0) {
                //交换左指针和i的数组下标值
                swap(nums,i,left++);
            }
            if(nums[i] == 2){
                //交换右指针和i的数组下标值
                swap(nums,i,right--);
                //如果交换后的数值不是1，i--回退
                if(nums[i] != 1){
                    i--;
                }
            }
        }
    }

    /**
     * 交换数组中2个下标的元素
     * @param nums
     * @param i
     * @param j
     */
    public void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    /**
     * 125. 验证回文串
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     * 双指针解法
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        if(s != null && s.length() == 0) return true;
        //先把字符串s全部转换为小写
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        //双指针分别指向字符串的前后两端
        int left = 0;
        int right = charArray.length - 1;

        while(left < right){
            //因为忽略只考虑字母和数字字符,所以字符数组遍历的过程中，通过字符的ASCII来判断左右指针的位置
            //当前左指针指向的字符是非字母或非数字的，则左指针右移
            while(left < right && !((charArray[left] >= 'a' && charArray[left] <= 'z') || (charArray[left] >= '0' && charArray[left] <= '9'))){
                left++;
            }
            //当前右指针指向的字符是非字母或非数字的，则右指针左移
            while(left < right && !((charArray[right] >= 'a' && charArray[right] <= 'z') || (charArray[right] >= '0' && charArray[right] <= '9'))){
                right--;
            }
            //比较左右指针指向字符，如果不同则非回文串
            if(charArray[left] != charArray[right]){
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
     * @param s
     * @return
     */
    public boolean isPalindrome2(String s) {
        if(s == null) return false;
        if(s != null && s.length() == 0) return true;
        // StringBuilder 效率大于 StringBuffer
        StringBuilder stringBuffer = new StringBuilder();
        //过滤字符串，得到新字符串，只包含字母和数字，并且字母统一小写
        //通过Character.isLetterOrDigit()匹配是否属于字母和数字
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
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
     * @param s
     * @return
     */
    public boolean isPalindrome3(String s) {
        if(s == null) return false;
        if(s != null && s.length() == 0) return true;
        // StringBuilder 效率大于 StringBuffer
        StringBuilder stringBuffer = new StringBuilder();
        //过滤构成新字符串：只包含字母和数字，并且字母统一小写
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                //大写字符转换为小写字母（ASCII规则）
                stringBuffer.append((char)(s.charAt(i) + 32));
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                stringBuffer.append(s.charAt(i));
            }
        }
        StringBuilder reverseStringBuffer = new StringBuilder(stringBuffer).reverse();
        return stringBuffer.toString().equals(reverseStringBuffer.toString());
    }

    /**
     * 回溯法 + 双指针判断回文串
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(String value, int startIndex, ArrayList<String> path, List<List<String>> result){
        //递归的结束条件（startIndex -> value.length()）
        if(startIndex == value.length()) {
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
            if (!isPalindromeString(builder.toString())){
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
     * @param value
     * @return
     */
    public boolean isPalindromeString(String value) {
        if(value == null) return false;
        if(value != null && value.length() == 0) return true;
        int left = 0;
        int right = value.length() - 1;
        while(left < right){
            if(value.charAt(left) != value.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    /**
     * 回溯法 + 动态规划预处理回文串状态
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
            Arrays.fill(dp[i],true);
        }
        //dp的赋值
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                //f(i,j) 表示 s[i..j]s[i..j] 是否为回文串，求得状态转移方程：F[i][j] = (s[i] == s[j]) && F[i + 1][j - 1]
                //dp状态数组记录
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
            }
        }
        backtrack2(s, 0, dp,path, result);
        return result;
    }

    public void backtrack2(String value, int startIndex, boolean[][] dp, LinkedList<String> path, List<List<String>> result){
        //递归的结束条件（startIndex -> value.length()）
        if(startIndex == value.length()) {
            result.add(new ArrayList<>(path));
//            System.out.println("result => " + result.toString());
            return;
        }
        //通过StringBuilder获取每次截断的字符串
        StringBuilder builder = new StringBuilder();
        //startIndex为切割线，每次递归遍历时的起始位置
        for (int i = startIndex; i < value.length(); i++) {
            builder.append(value.charAt(i));
            if (!dp[startIndex][i]){
//                System.out.println("非回文 continue => " + builder.toString());
                continue;
            }
            //add符合回文要求的子串
            path.addLast(builder.toString());
//            System.out.println("  截取元素 => " + path.get(path.size() - 1));
//            System.out.println("  递归之前 => " + path);
            // 寻找i+1为起始位置的子串
            backtrack2(value, i + 1,dp, path, result);
            //回溯过程，弹出本次已经填入的子串（remove掉数组尾部元素）
//            System.out.println("回退元素 => " + path.get(path.size() - 1));
            path.removeLast();
//            System.out.println("递归之后 => " + path);
        }
    }


    /**
     * 回溯法 + 动态规划记忆化搜索
     * @param s
     * @return
     */
    public List<List<String>> partition3(String s) {
        List<List<String>> result = new ArrayList<>();
        //因为回溯寻找全部解的过程都是尾部插入和删除的，所以使用LinkedList的Deque的栈接口，方便末尾插入和删除
        LinkedList<String> path = new LinkedList<>();
        //动态规划方案回文串的状态数组（空间换时间）
        int[][] dp = new int[s.length()][s.length()];
        backtrack3(s, 0, dp,path, result);
        return result;
    }

    public void backtrack3(String value, int startIndex, int[][] dp, LinkedList<String> path, List<List<String>> result){
        //递归的结束条件（startIndex -> value.length()）
        if(startIndex == value.length()) {
            result.add(new ArrayList<>(path));
//            System.out.println("result => " + result.toString());
            return;
        }
        //startIndex为切割线，每次递归遍历时的起始位置
        for (int i = startIndex; i < value.length(); i++) {
            if (isPalindromeString3(value, dp, startIndex, i) == 1){
                //尾部添加子串
                path.addLast(value.substring(startIndex, i + 1));
                System.out.println(" 截取元素 => " + path.get(path.size() - 1));
                System.out.println(" 递归之前 => " + path);
                // 寻找i+1为起始位置的子串是否包含回文串
                backtrack3(value, i + 1,dp, path, result);
                System.out.println("回退元素 => " + path.get(path.size() - 1));
                //回溯状态重置（回到递归树的上一个节点继续遍历其他子节点）（remove尾部元素）
                path.removeLast();
                System.out.println("递归之后 => " + path);
            }
        }
    }

    /**
     *判断是否回文串（递归记忆法搜索）
     * @param value
     * @return
     */
    public int isPalindromeString3(String value, int[][] dp, int i, int j) {
        // 记忆化搜索中，f[i][j] = 0 表示未搜索，1 表示是回文串，-1 表示不是回文串
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        if (i >= j) {
            dp[i][j] = 1;
        } else if (value.charAt(i) == value.charAt(j)) {
            dp[i][j] = isPalindromeString3(value, dp,i + 1, j - 1);
        } else {
            dp[i][j] = -1;
        }
        return dp[i][j];
    }




    /**
     * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0，F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
     * @param n
     * @return
     */
    public int fib(int n) {
        if(n < 2) return n;
        //动态规划问题求解
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            //F(i) = F(i - 1) + F(i - 2)
            dp[i] = dp[i - 1] +dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0，F(1) = 1
     * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
     * @param n
     * @return
     */
    public int fib2(int n) {
        if(n < 2) return n;
        //F(0) = 0
        int a = 0;
        //F(1) = 1
        int b = 1;
        int sum = 0;
        for(int i = 2; i <= n; i++){
            //F(i) = F(i - 1) + F(i - 2)
            sum = a + b;
            if(i == n) break;
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
     * @param n
     * @return
     */
    public int fib3(int n) {
        if(n < 2) return n;
        //递归思路
        return fib3(n - 1) + fib3(n - 2);
    }

    /**
     * 70. 爬楼梯
     * 动态规划（优化空间复杂度）
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        //列举n = 1,2,3,4,5,6,7... F(n) = ? 寻找规律
        if(n <= 2) return n;
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
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        //递归解法-记忆化优化
        //缓存dp数组，优化在递归过程中重复项只是使用dp[i]
        int[] dp = new int[n + 1];
        return climbStairsDP(n, dp);
    }

    public int climbStairsDP(int n, int[] dp){
        //递归结束条件
        if(dp[n] != 0){
            return dp[n];
        }
        if(n == 1){
            dp[n] = 1;
        } else if(n == 2){
            dp[n] = 2;
        } else {
            dp[n] = climbStairsDP(n - 1, dp) + climbStairsDP(n - 2, dp);
        }
        return dp[n];
    }


    public void reverseString(char[] s) {
        System.out.println("old:" + Arrays.toString(s));
        if(s == null ||s.length == 0) return;
        //字符数组双指针交换元素位置
        int start = 0;
        int end = s.length - 1;
        char temp;
        while(start < end){
            temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
        System.out.println("new:" +Arrays.toString(s));
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
        if(s == null || s.length() < 2 || k == 1) return s;
        System.out.println("old:"+s +" length:"+s.length());
        char[] charArray = s.toCharArray();
        //字符串总长度 < 2k
        if(charArray.length < (2 * k)){
            if((charArray.length) >= k){  //(charArray.length >= k):字符总长度>=k，反转前k个字符，其余字符不变
                reverseIndex(charArray,0,k - 1);
            } else { //(charArray.length < k):字符总长度<k，字符全部反转
                reverseIndex(charArray, 0,charArray.length - 1);
            }
            return String.valueOf(charArray);
        }
        //字符串总长度 >= 2k
        int start = 0;
        for (int i = 0; i < charArray.length; i++) {
            //每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符
            if ((i + 1) % (2 * k) == 0) {
                //反转这2k字符中的前k个字符
                reverseIndex(charArray,start,start + (k - 1));
                //start更新为下一个位置
                start = i + 1;

                //剩余字符数量: (charArray.length - start)
                if((charArray.length - start) < (2 * k)){
                    if((charArray.length - start) >= k){ //如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
                        reverseIndex(charArray,start,start + (k - 1));
                    } else { //(((charArray.length - start) < k))如果剩余字符少于k个，则将剩余字符全部反转。
                        reverseIndex(charArray, start,charArray.length - 1);
                    }
                    break;
                }
            }
        }
        System.out.println("new:"+String.valueOf(charArray));
        return String.valueOf(charArray);
    }

    /**
     * 反转下标的字符串
     * 优化：时间复杂度O(n/end-start) 空间复杂度 O(1)
     */
    public void reverseIndex(char[] charArray, int start,int end){
//        System.out.println("reverseIndex-charArray:"+Arrays.toString(charArray) + " start:" + start + " end:" + end);
        if(charArray == null || charArray.length < 2) return ;
        char temp;
        while (start < end){
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
     * @param s
     * @param k
     * @return
     */
    public String reverseStr2(String s, int k) {
        if(s == null || s.length() < 2 || k == 1) return s;
        System.out.println("old:"+s +" length:"+s.length());
        int length = s.length();
        char[] charArray = s.toCharArray();
        //i作为循环起始变量，i间隔为2K（每计数至2k个字符，就反转这2k字符中的前k个字符）
        //时间复杂度O(n/2k) 空间复杂度 O(1)
        for (int i = 0; i < length; i += 2 * k) {
            //剩余字符长度：(length - i)
            if((length - i) >= k){ //剩余字符大于k个，反转前k个字符，其余字符保持原样
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
    public void reverseIndex2(char[] charArray, int start,int end){
//        System.out.println("reverseIndex-charArray:"+Arrays.toString(charArray) + " start:" + start + " end:" + end);
        if(charArray == null || charArray.length < 2) return ;
        char temp;
        while (start < end){
            temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
    }


    /**
     * 剑指 Offer 05. 替换空格
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        if(s == null || s.length() == 0) return s;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                builder.append("%20");
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

    public String replaceSpace2(String s) {
        if(s == null || s.length() == 0) return s;
        //StringBuilder Api解法
        return s.replaceAll(" ","%20");
    }

    public String replaceSpace3(String s) {
        if(s == null || s.length() == 0) return s;
        //Char数组替换法
        char[] charArray = new char[s.length() * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                charArray[size++] = '%';
                charArray[size++] = '2';
                charArray[size++] = '0';
            } else {
                charArray[size++] = s.charAt(i);
            }
        }
        return String.valueOf(charArray,0,size);
    }

    /**
     * 151. 翻转字符串里的单词
     * 给你一个字符串 s ，逐个翻转字符串中的所有 单词 。
     *
     * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
     * 请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
     * 1.输入字符串 s 可以在前面、后面或者单词间包含多余的空格。
     * 2.翻转后单词间应当仅用一个空格分隔。
     * 3.翻转后的字符串中不应包含额外的空格。
     * 4.s包含英文大小写字母、数字和空格 ' '
     * 5.s中 至少存在一个 单词
     *
     * 单指针扫描单词 + 空格处理 + 逻辑剪枝 + 双指针反转
     *
     * @param s s
     * @return return
     */
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        //1.先整体反转字符串字符
        reverseIndexWords(charArray,0,charArray.length - 1);
        StringBuilder builder = new StringBuilder();

        //扫描单词的下标指针
        int wordIndex = -1;
        //2.再把每个单词单独反转一次
        for (int i = 0; i < charArray.length; i++) {
            //每次新的单词扫描时，当字符非空格时，记录字符下标
            if(charArray[i] != ' ' && wordIndex == -1){
                wordIndex = i;
            }
            //字符串中末尾单词无空格情况
            if((i == charArray.length - 1) && (wordIndex != -1)){
                //反转字符数组末尾单词
                reverseIndexWords(charArray,wordIndex,i);
                //如果builder不是首位则拼接一个空格
                if(builder.length() != 0){
                    builder.append(' ');
                }
                //拼接反转后的单词
                for (int j = wordIndex; j <= i; j++) {
                    if(charArray[j] != ' '){
                        builder.append(charArray[j]);
                    }
                }
                break;
            }

            //字符串中每个单词后会连接一个空格
            if((charArray[i] == ' ') && (wordIndex != -1)){
                //反转当前扫描的单词
                reverseIndexWords(charArray,wordIndex,i - 1);
                //如果builder不是首位则拼接一个空格
                if(builder.length() != 0){
                    builder.append(' ');
                }
                //拼接反转后的单词
                for (int j = wordIndex; j < i; j++) {
                    if(charArray[j] != ' '){
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
     * @param array 数组
     * @param start 反转数组开始下标
     * @param end 反转数组结束下标
     */
    public void reverseIndexWords(char[] array, int start, int end){
        if(array == null || array.length < 2) return;
        char temp;
        while (start < end){
            temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }

    /**
     * 151. 翻转字符串里的单词
     * @param s s
     * @return return
     */
    public String reverseWords2(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        //单词起始指针下标
        int wordIndex = -1;
        //1.先整体反转字符串字符
        reverseIndexWords(charArray,0,charArray.length - 1);
        //2.再把每个单词单独反转一次
        for (int i = 0; i < charArray.length; i++) {
            //每次新的单词扫描时，当字符非空格时，记录字符下标
            if (charArray[i] != ' ' && wordIndex == -1) {
                wordIndex = i;
            }
            //当单词指针存在时：1.扫描到数组末尾 2.扫描到空格字符
            if (((i == charArray.length - 1) ||((charArray[i + 1] == ' '))) && (wordIndex != -1)) {
                //字符数组中的单词反转
                reverseIndexWords(charArray, wordIndex, i);
                //如果builder不是首位则拼接一个空格
                if(builder.length() != 0){
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
        while (start < end){
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
            if (((i == charArray.length - 1) ||((charArray[i + 1] == ' '))) && (wordIndex != -1)) {
                //先拼接空格
                if(builder.length() != 0){
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
     *
     * 使用栈的数据结构，先进后出实现单词反转
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
            if(charArray[i] != ' '){
                //扫描单词
                builder.append(charArray[i]);
                //扫描末尾单词后，入栈
                if(i == charArray.length - 1){
                    stack.push(builder.toString());
                    break;
                }
                //每个单词间隔为空格
                if(charArray[i + 1] == ' '){
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
            if(stack.size() > 0){
                builder.append(' ');
            }
        }
        System.out.println("result:"+builder.toString());
        return builder.toString();
    }


    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        if(s == null || s.length() == 0) return s;
        //时间复杂度：O(n)
        //空间复杂度：O(n)
        //辅助数组，长度为n
        char[] charArray = new char[n];
        //长度为s.length()
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i < n){
                charArray[i] = s.charAt(i);
            } else {
                builder.append(s.charAt(i));
            }
            if(i == s.length() - 1){
                builder.append(charArray);
            }
        }
        System.out.println("result:"+builder.toString());
        return builder.toString();
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords2(String s, int n) {
        if(s == null || s.length() == 0) return s;
        StringBuilder builder = new StringBuilder();
        builder.append(s.substring(n));
        builder.append(s.substring(0,n));
        System.out.println("result:"+builder.toString());
        return builder.toString();
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords3(String s, int n) {
        if(s == null || s.length() == 0) return s;
        //简写
        return s.substring(n) + s.substring(0,n);
    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
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
    public void reverseLeftWordIndex(char[] array, int start, int end){
        if(array == null || array.length == 0) return;
        char temp;
        while (start < end){
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
        for (i = 0,j = 0; i < haystackLength && j < needleLength; i++) {
            //"模式串"字符匹配相同时，模式串指针右移
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else { //字符匹配不相同时
                //"模式串"指针 j 重新指向"模式串"头部，i == j  i = 0，在结束本次for循环时，i++，则新的匹配中i = 1 j = 0
                i = i - j;
                j = 0;
            }
            //完全匹配成功
            if (j == needleLength) {
                return i - needleLength;
            }
        }
        return -1;
    }

    /**
     * 28. 实现 strStr() => indexOf()
     * 字符串匹配实现
     * KMP解法
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
            //匹配失败
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
     * @param needle
     * @param next
     */
    public void getNext(String needle,int[] next){
        if(needle == null || needle.length() == 0 || next == null || next.length == 0) return;
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
            while(prefixIndex > 0 && needle.charAt(suffixIndex) != needle.charAt(prefixIndex)){
                //前缀指针回退
                prefixIndex = next[prefixIndex - 1];
            }
            //3.匹配成功(前后缀相同情况)
            if(needle.charAt(suffixIndex) == needle.charAt(prefixIndex)){
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
    public int bmIndexOf(String haystack, String needle){
        //BM算法实现字符匹配(右后向前匹配)

        //特殊情况处理
        if(haystack == null || needle == null) return -1;
        char[] hayCharArray = haystack.toCharArray();
        char[] neeCharArray = needle.toCharArray();
        //文本串和模式串的长度
        int hayLength = hayCharArray.length;
        int neeLength = neeCharArray.length;
        if(hayLength < neeLength) return -1;
        if(neeLength == 0) return 0;

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

        while(patternIndex>= 0){
            //模式串每轮首次匹配
            if(patternIndex == neeLength - 1){
                if(hayCharArray[prefixIndex] == neeCharArray[patternIndex]){
                    goodSuffixArray = new char[++goodSuffixSum];
                    goodSuffixArray[goodSuffixSum - 1] = hayCharArray[prefixIndex];
                } else {
                    //首次匹配，匹配失败，则属于坏字符情况
                    if(prefixEndIndex == hayLength - 1){
//                        System.out.println("匹配失败");
                        return -1;
                    }
                    int moveCount = getBadSuffixMoveCount(hayCharArray[prefixIndex],neeCharArray,neeLength,goodSuffixSum);
                    prefixEndIndex = Math.min(prefixEndIndex + moveCount,hayLength - 1);
                    prefixIndex = prefixEndIndex;
                    patternIndex = neeLength - 1;
                    continue;
                }
            } else {
                if(hayCharArray[prefixIndex] == neeCharArray[patternIndex]){
                    //匹配成功，继续添加好后缀数组
                    if(goodSuffixArray != null){
                        //好后缀数组扩容
                        goodSuffixArray = Arrays.copyOf(goodSuffixArray, ++goodSuffixSum);
                        //更新好后缀
                        goodSuffixArray[goodSuffixSum - 1] = hayCharArray[prefixIndex];
                    }
                } else {
                    //匹配失败，则分情况移动模式串匹配指针，加快匹配速度
                    //1."坏字符"情况
                    //2."好后缀"情况
                    if(prefixEndIndex == hayLength - 1){
//                        System.out.println("匹配失败");
                        break;
                    }

                    //1.计算"坏字符"移动个数
                    int moveCount = getBadSuffixMoveCount(hayCharArray[prefixIndex],neeCharArray,neeLength,goodSuffixSum);
                    //2.计算"好后缀"移动个数
                    //非头部位置的好后缀子集，直接使用坏字符规则,则goodSuffixMoveCount = 0，max(a,b)走坏字符逻辑
                    int goodSuffixMoveCount = getGoodSuffixMoveCount(neeCharArray,neeLength,goodSuffixArray,goodSuffixSum);
                    //取坏字符和好后缀2个模式中移动较大值做为当前的实际位移
                    prefixEndIndex = Math.min(prefixEndIndex + (Math.max(goodSuffixMoveCount,moveCount)),hayLength - 1);
                    prefixIndex = prefixEndIndex;
                    patternIndex = neeLength - 1;

                    //好后缀重置
                    goodSuffixArray = null;
                    goodSuffixSum = 0;
                    continue;
                }
            }

            //模式串"完全匹配"
            if(neeLength == goodSuffixSum){
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
    public int getBadSuffixMoveCount(char badChar, char[] needleCharArray, int needleLength,int goodSuffixSum) {
        int badSuffixMoveCount;
        int badendindex = needleLength - 1 - goodSuffixSum; // 右侧优先
        while(badendindex >= 0 && badChar != needleCharArray[badendindex]){
            badendindex--;
        }
        if(badendindex == -1){ //模式串不存在坏字符,则模式串向右整体移动匹配: 文本串匹配指针向右移动
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
    public boolean getExistGoodSuffix(char[] needleCharArray, int needleLength, char[] goodSuffixArray, int goodSuffixLength){
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
    public void reverseArrayIndex(char[] charArray, int start,int end){
        if(charArray == null || charArray.length < 2) return ;
        //双指针反转
        char temp;
        while (start < end){
            temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
    }

    /**
     * 查找模式串中好后缀的需要滑动的数量
     */
    public int getGoodSuffixMoveCount(char[] needleCharArray, int neeLength, char[] goodSuffixArray,int gooLength) {
        if(goodSuffixArray == null || goodSuffixArray.length == 0) return 0;
        //先反转好后缀数组，和模式串相同方向
        reverseArrayIndex(goodSuffixArray,0,goodSuffixArray.length - 1);
        int moveCount = 0;
        boolean isExistGoodSuffix = getExistGoodSuffix(needleCharArray,neeLength,goodSuffixArray,gooLength);
        if(isExistGoodSuffix){
            int j = gooLength - 1;
            //1.如果模式串含有好后缀，无论是中间还是头部可以按照规则进行移动。如果好后缀在模式串中出现多次，则以最右侧的好后缀为基准。
            //模式串完全包含好后缀
            for (int i = neeLength - gooLength - 1; i >= 0; i--) {
                while(j >= 0){
                    if (needleCharArray[i] != goodSuffixArray[j]) {
                        j = gooLength - 1;
                        break;
                    } else {
                        j--;
                    }
                }
                if(j == -1){
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
     * @param s s
     * @return return
     */
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        int[] next = new int[s.length()];
        getNext(s,next);


        return false;
    }

}
