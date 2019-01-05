/*
SQLyog v10.2 
MySQL - 5.5.28 : Database - online_examination_system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`online_examination_system` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `online_examination_system`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `des` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`id`,`name`,`des`) values (1,'数据结构','课程内容为各种主要的数据结构及其在计算机中的实现。主要内容有：线性表，栈，队列，串、多维数组和广义表，树和二叉树，多维数组、广义表和一般的图结构等；数据在内存中的管理和在外存中的表示（文件结构）；排序和检索等常用算法。通过本课程的学习，使应考者掌握如何根据问题的需求合理地组织数据，在计算机中有效地存储数据和处理数据，并初步了解算法设计和分析。　');

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `id` int(8) NOT NULL,
  `name` varchar(50) NOT NULL,
  `setdate` date NOT NULL,
  `des` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dept` */

insert  into `dept`(`id`,`name`,`setdate`,`des`) values (1,'信息科学与工程学院','2013-05-01',' 信息科学与工程学院');

/*Table structure for table `grade` */

DROP TABLE IF EXISTS `grade`;

CREATE TABLE `grade` (
  `id` int(11) NOT NULL,
  `studentid` int(11) NOT NULL,
  `teacherid` int(11) NOT NULL,
  `courseid` int(8) NOT NULL,
  `grade` int(3) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `studentid` (`studentid`),
  KEY `teacherid` (`teacherid`),
  KEY `courseid` (`courseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `grade` */

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `id` int(8) NOT NULL,
  `name` varchar(50) NOT NULL,
  `setdate` date NOT NULL,
  `deptid` int(8) NOT NULL,
  `des` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `major_ibfk_1` (`deptid`),
  CONSTRAINT `major_ibfk_1` FOREIGN KEY (`deptid`) REFERENCES `dept` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `major` */

insert  into `major`(`id`,`name`,`setdate`,`deptid`,`des`) values (1,'计算机科学与技术','1995-05-02',1,'计算机科学与技术计算机科学与技术');

/*Table structure for table `paper_fill` */

DROP TABLE IF EXISTS `paper_fill`;

CREATE TABLE `paper_fill` (
  `id` int(8) NOT NULL,
  `papername` varchar(200) NOT NULL,
  `question` text NOT NULL,
  `modelanswer` text NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `studentid` int(8) NOT NULL,
  `courseid` int(8) NOT NULL,
  `studentanswer` text,
  `score` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `studentid` (`studentid`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `paper_fill_ibfk_1` FOREIGN KEY (`studentid`) REFERENCES `student` (`id`),
  CONSTRAINT `paper_fill_ibfk_2` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_fill` */

/*Table structure for table `paper_judge` */

DROP TABLE IF EXISTS `paper_judge`;

CREATE TABLE `paper_judge` (
  `id` int(8) NOT NULL,
  `papername` varchar(200) NOT NULL,
  `question` text NOT NULL,
  `modelanswer` int(1) NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `studentid` int(8) NOT NULL,
  `courseid` int(8) NOT NULL,
  `studentanswer` int(1) DEFAULT NULL,
  `score` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `studentid` (`studentid`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `paper_judge_ibfk_1` FOREIGN KEY (`studentid`) REFERENCES `student` (`id`),
  CONSTRAINT `paper_judge_ibfk_2` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_judge` */

/*Table structure for table `paper_select` */

DROP TABLE IF EXISTS `paper_select`;

CREATE TABLE `paper_select` (
  `id` int(8) NOT NULL,
  `papername` varchar(200) NOT NULL,
  `question` text NOT NULL,
  `modelanswer` int(1) NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `studentid` int(8) NOT NULL,
  `courseid` int(8) NOT NULL,
  `studentanswer` int(1) DEFAULT NULL,
  `score` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `studentid` (`studentid`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `paper_select_ibfk_1` FOREIGN KEY (`studentid`) REFERENCES `student` (`id`),
  CONSTRAINT `paper_select_ibfk_2` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_select` */

/*Table structure for table `paper_short_answer` */

DROP TABLE IF EXISTS `paper_short_answer`;

CREATE TABLE `paper_short_answer` (
  `id` int(8) NOT NULL,
  `papername` varchar(200) NOT NULL,
  `question` text NOT NULL,
  `modelanswer` text NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `studentid` int(8) NOT NULL,
  `courseid` int(8) NOT NULL,
  `studentanswer` text,
  `score` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `studentid` (`studentid`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `paper_short_answer_ibfk_1` FOREIGN KEY (`studentid`) REFERENCES `student` (`id`),
  CONSTRAINT `paper_short_answer_ibfk_2` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_short_answer` */

/*Table structure for table `politicsclass` */

DROP TABLE IF EXISTS `politicsclass`;

CREATE TABLE `politicsclass` (
  `id` int(8) NOT NULL,
  `name` varchar(50) NOT NULL,
  `majorid` int(8) NOT NULL,
  `teacherid` int(8) NOT NULL,
  `des` text,
  PRIMARY KEY (`id`),
  KEY `politicsclass_ibfk_1` (`majorid`),
  KEY `politicsclass_ibfk_2` (`teacherid`),
  CONSTRAINT `politicsclass_ibfk_1` FOREIGN KEY (`majorid`) REFERENCES `major` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `politicsclass_ibfk_2` FOREIGN KEY (`teacherid`) REFERENCES `teacher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `politicsclass` */

insert  into `politicsclass`(`id`,`name`,`majorid`,`teacherid`,`des`) values (1,'计算机科学与技术一班',1,1,'计算机科学与技术一班');

/*Table structure for table `power` */

DROP TABLE IF EXISTS `power`;

CREATE TABLE `power` (
  `id` int(2) NOT NULL,
  `power` varchar(50) NOT NULL,
  `des` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `power` */

insert  into `power`(`id`,`power`,`des`) values (1,'学生用户',NULL),(2,'普通教师用户',NULL),(3,'管理员',NULL);

/*Table structure for table `question_bank_fill` */

DROP TABLE IF EXISTS `question_bank_fill`;

CREATE TABLE `question_bank_fill` (
  `id` int(8) NOT NULL,
  `question` text NOT NULL,
  `answer` text NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `courseid` int(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `teacherid` (`teachername`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `question_bank_fill_ibfk_1` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question_bank_fill` */

insert  into `question_bank_fill`(`id`,`question`,`answer`,`teachername`,`courseid`) values (1,'通常从四个方面评价算法的质量：_________、_________、_________和_________。','正确性   易读性   强壮性   高效率','Joesea Lea',1),(2,'一个算法的时间复杂度为(n3+n2log2n+14n)/n2，其数量级表示为________。','O(n)','Joesea Lea',1),(3,'假定一棵树的广义表表示为A（C，D（E，F，G），H（I，J）），则树中所含的结点数为_________个，树的深度为___________，树的度为_________。',' 9    3    3','Joesea Lea',1),(4,'后缀算式9 2 3 +- 10 2 / -的值为__________。中缀算式（3+4X）-2Y/3对应的后缀算式为_______________________________。',' -1      3 4 X * + 2 Y * 3 / -','Joesea Lea',1),(5,'若用链表存储一棵二叉树时，每个结点除数据域外，还有指向左孩子和右孩子的两个指针。在这种存储结构中，n个结点的二叉树共有________个指针域，其中有________个指针域是存放了地址，有________________个指针是空指针。',' 2n   n-1     n+1','Joesea Lea',1),(6,'对于一个具有n个顶点和e条边的有向图和无向图，在其对应的邻接表中，所含边结点分别有_______个和________个。','e    2e','Joesea Lea',1),(7,'AOV网是一种___________________的图。','有向无回路','Joesea Lea',1),(8,'在一个具有n个顶点的无向完全图中，包含有________条边，在一个具有n个顶点的有向完全图中，包含有________条边。',' n(n-1)/2     n(n-1)','Joesea Lea',1),(9,'向一棵B_树插入元素的过程中，若最终引起树根结点的分裂，则新树比原树的高度___________。','增加1','Joesea Lea',1),(10,'在堆排序的过程中，对任一分支结点进行筛运算的时间复杂度为________，整个堆排序过程的时间复杂度为________。','O(log2n)   O(nlog2n)','Joesea Lea',1),(11,'在快速排序、堆排序、归并排序中，_________排序是稳定的。','归并','Joesea Lea',1);

/*Table structure for table `question_bank_judge` */

DROP TABLE IF EXISTS `question_bank_judge`;

CREATE TABLE `question_bank_judge` (
  `id` int(8) NOT NULL,
  `question` text NOT NULL,
  `answer` int(1) NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `courseid` int(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `teacherid` (`teachername`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `question_bank_judge_ibfk_1` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question_bank_judge` */

insert  into `question_bank_judge`(`id`,`question`,`answer`,`teachername`,`courseid`) values (1,'数据的逻辑结构与数据元素本身的内容和形式无关。',1,'Joesea Lea',1),(2,'使用三元组表示稀疏矩阵中的非零元素能节省存储空间。',1,'Joesea Lea',1),(4,'在一棵二叉树中，假定每个结点只有左子女，没有右子女，则对它分别进行前序遍历和按层遍历时具有相同的结果。',1,'Joesea Lea',1),(5,'能够在链接存储的有序表上进行折半搜索，其时间复杂度与在顺序存储的有序表上相同。',2,'Joesea Lea',1),(6,'邻接表表示只能用于有向图的存储，邻接矩阵对于有向图和无向图的存储都适用。',2,'Joesea Lea',1),(7,'在索引顺序结构上实施分块搜索，在等概率情况下，其平均搜索长度不仅与子表个数有关，而且与每一个子表中的对象个数有关。',1,'Joesea Lea',1),(8,'向一棵B树插入关键码的过程中，若最终引起树根结点的分裂，则新树比原树的高度减少1。',2,'Joesea Lea',1),(9,'算法和程序都应具有下面一些特征：有输入，有输出，确定性，有穷性，有效性。',2,'Joesea Lea',1),(10,'用字符数组存储长度为n的字符串，数组长度至少为n+1。',1,'Joesea Lea',1),(11,'邻接矩阵适用于稀疏图的表示，邻接表适用于稠密图的表示。',2,'Joesea Lea',1),(12,'对一个无向连通图进行一次深度优先搜索遍历时可以访问到图中的所有顶点。',1,'Joesea Lea',1),(13,'在索引顺序结构的搜索中，对索引表只可以采取顺序搜索，不可以采用折半搜索。',2,'Joesea Lea',1),(14,'图中各个顶点的编号是人为的，不是它本身固有的，因此可以根据需要进行改变。',1,'Joesea Lea',1),(15,'线性表若采用链式存储表示时，其存储结点的地址可连续也可不连续。',1,'Joesea Lea',1),(16,' 在线性链表中删除结点时，只需要将被删结点释放，不需要修改任何指针。',2,'Joesea Lea',1),(17,'在用单链表表示的链式队列Q中，假定队头指针为Q->front，队尾指针为Q->rear，则链队为空的条件为Q->front==Q->rear。',2,'Joesea Lea',1),(18,'一棵AVL树的所有叶结点不一定在同一层次上，同样，平衡的m路搜索树的叶结点也不一定在同一层次上。',1,'Joesea Lea',1),(19,'一个广义表((a),((b),c),(d))的表尾是“((b),c),(d)”。',2,'Joesea Lea',1),(20,'在一棵二叉树中，假定每个结点只有左子女，没有右子女，若对它分别进行中序遍历和后序遍历，则具有相同的结果。',1,'Joesea Lea',1);

/*Table structure for table `question_bank_select` */

DROP TABLE IF EXISTS `question_bank_select`;

CREATE TABLE `question_bank_select` (
  `id` int(8) NOT NULL,
  `question` text NOT NULL,
  `answer` int(1) NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `courseid` int(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `teacherid` (`teachername`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `question_bank_select_ibfk_1` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question_bank_select` */

insert  into `question_bank_select`(`id`,`question`,`answer`,`teachername`,`courseid`) values (1,'栈和队列的共同特点是(      )。\r\nA.只允许在端点处插入和删除元素\r\nB.都是先进后出    \r\nC.都是先进先出\r\nD.没有共同点 \r\n\r\n',1,'Joesea Lea',1),(2,'用链接方式存储的队列，在进行插入运算时(   ).\r\nA. 仅修改头指针  　      \r\nB. 头、尾指针都要修改\r\nC. 仅修改尾指针             \r\nD.头、尾指针可能都要修改\r\n',4,'Joesea Lea',1),(3,'以下数据结构中哪一个是非线性结构？(   )\r\nA. 队列   　　  \r\nB. 栈        \r\nC. 线性表  　　  \r\nD. 二叉树\r\n',4,'Joesea Lea',1),(4,'设有一个二维数组A[m][n]，假设A[0][0]存放位置在644(10)，A[2][2]存放位置在676(10)，每个元素占一个空间，问A[3][3](10)存放在什么位置？脚注(10)表示用10进制表示。\r\nA．688          B．678        C．692          D．696\r\n',3,'Joesea Lea',1),(5,'树最适合用来表示(      )。\r\nA.有序数据元素\r\nB.无序数据元素    \r\nC.元素之间具有分支层次关系的数据    \r\nD.元素之间无联系的数据\r\n',3,'Joesea Lea',1),(6,'二叉树的第k层的结点数最多为(  ).\r\nA．2k-1       B.2K+1      \r\nC. 2K-1  　　 D. 2k-1\r\n',4,'Joesea Lea',1),(7,'若有18个元素的有序表存放在一维数组A[19]中，第一个元素放A[1]中，现进行二分查找，则查找A［3］的比较序列的下标依次为(      )\r\nA.1，2，3		\r\nB. 9，5，2，3\r\nC.9，5，3		\r\nD. 9，4，2，3\r\n',4,'Joesea Lea',1),(8,'对n个记录的文件进行快速排序，所需要的辅助存储空间大致为\r\nA. O（1）   　　B. O（n）　　   C. O（1og2n）   D. O（n2）\r\n',3,'Joesea Lea',1),(9,'对于线性表（7，34，55，25，64，46，20，10）进行散列存储时，若选用H（K）=K %9作为散列函数，则散列地址为1的元素有（   ）个，\r\nA．1         B．2           C．3         D．4\r\n',4,'Joesea Lea',1),(10,'设有6个结点的无向图，该图至少应有(      )条边才能确保是一个连通图。\r\nA.5       B.6         \r\nC.7       D.8\r\n',1,'Joesea Lea',1),(11,'对一个算法的评价，不包括如下（ ）方面的内容。\r\nA．健壮性和可读性     \r\nB．并行性      \r\nC．正确性     \r\nD．时空复杂度\r\n',2,'Joesea Lea',1),(12,'在带有头结点的单链表HL中，要向表头插入一个由指针p指向的结点，则执行( )。\r\n    A. p->next=HL->next; HL->next=p;       B. p->next=HL; HL=p;\r\n          C. p->next=HL; p=HL;                   D. HL=p; p->next=HL;\r\n',1,'Joesea Lea',1),(13,'对线性表，在下列哪种情况下应当采用链表表示？( )\r\nA.经常需要随机地存取元素 \r\nB.经常需要进行插入和删除操作\r\nC.表中元素需要占据一片连续的存储空间\r\nD.表中元素的个数不变\r\n',2,'Joesea Lea',1),(14,'一个栈的输入序列为1 2 3，则下列序列中不可能是栈的输出序列的是( )\r\nA. 2 3 1	\r\nB. 3 2 1\r\nC. 3 1 2			 D. 1 2 3\r\n',3,'Joesea Lea',1),(15,'AOV网是一种（ ）。\r\nA．有向图       B．无向图       C．无向无环图   D．有向无环图\r\n',4,'Joesea Lea',1),(16,'采用开放定址法处理散列表的冲突时，其平均查找长度（）。\r\nA．低于链接法处理冲突         B.  高于链接法处理冲突\r\nC．与链接法处理冲突相同       \r\nD．高于二分查找\r\n',2,'Joesea Lea',1),(17,'若需要利用形参直接访问实参时，应将形参变量说明为（ ）参数。\r\nA．值      B．函数      \r\nC．指针    D．引用\r\n',4,'Joesea Lea',1),(18,'在稀疏矩阵的带行指针向量的链接存储中，每个单链表中的结点都具有相同的（ ）。\r\nA．行号     B．列号      \r\nC．元素值   D．非零元素个数\r\n\r\n',1,'Joesea Lea',1),(19,'快速排序在最坏情况下的时间复杂度为（ ）。\r\nA．O(log2n)      B．O(nlog2n)       C．0(n)         \r\nD．0(n2)\r\n',4,'Joesea Lea',1),(20,'从二叉搜索树中查找一个元素时，其时间复杂度大致为( )。\r\nA. O(n)      B. O(1)      \r\nC. O(log2n)  D. O(n2)\r\n',3,'Joesea Lea',1);

/*Table structure for table `question_bank_short_answer` */

DROP TABLE IF EXISTS `question_bank_short_answer`;

CREATE TABLE `question_bank_short_answer` (
  `id` int(8) NOT NULL,
  `question` text NOT NULL,
  `answer` text NOT NULL,
  `tearchername` varchar(50) DEFAULT NULL,
  `courseid` int(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tearcherid` (`tearchername`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `question_bank_short_answer_ibfk_1` FOREIGN KEY (`courseid`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question_bank_short_answer` */

insert  into `question_bank_short_answer`(`id`,`question`,`answer`,`tearchername`,`courseid`) values (1,'LinkList mynote(LinkList L)\r\n       {//L是不带头结点的单链表的头指针\r\n             if(L&&L->next){\r\n                  q=L；L=L－>next；p=L；\r\n        S1：       while(p－>next) p=p－>next；\r\n        S2：       p－>next=q；q－>next=NULL；\r\n              } \r\n              return  L；\r\n            }\r\n    请回答下列问题：\r\n   （1）说明语句S1的功能；\r\n   （2）说明语句组S2的功能； \r\n       （3）设链表表示的线性表为（a1,a2, …,an）,写出算法执行后的返回值所表示的线性表。\r\n','（1）查询链表的尾结点\r\n（2）将第一个结点链接到链表的尾部，作为新的尾结点\r\n（3）返回的线性表为（a2,a3,…,an,a1）\r\n','Joesea Lea',1),(2,'void ABC(BTNode * BT)\r\n{\r\n        if  BT {\r\n          ABC (BT->left);\r\n          ABC (BT->right);\r\n          cout<<BT->data<<\' \';\r\n          }\r\n        }\r\n        该算法的功能是：','递归地后序遍历链式存储的二叉树。','Joesea Lea',1),(3,'设一组初始记录关键字序列为(45，80，48，40，22，78)，则分别给出第4趟简单选择排序和第4趟直接插入排序后的结果。','(22，40，45，48，80，78)，(40，45，48，80，22，78)','Joesea Lea',1),(4,'设指针变量p指向双向链表中结点A，指针变量q指向被插入结点B，要求给出在结点A的后面插入结点B的操作序列（设双向链表中结点的两个指针域分别为llink和rlink）。','q->llink=p; q->rlink=p->rlink; p->rlink->llink=q; p->rlink=q;','Joesea Lea',1),(5,'设一组有序的记录关键字序列为(13，18，24，35，47，50，62，83，90)，查找方法用二分查找，要求计算出查找关键字62时的比较次数并计算出查找成功时的平均查找长度。','2,ASL=91*1+2*2+3*4+4*2)=25/9','Joesea Lea',1),(6,'设一棵树T中边的集合为{(A，B)，(A，C)，(A，D)，(B，E)，(C，F)，(C，G)}，要求用孩子兄弟表示法（二叉链表）表示出该树的存储结构并将该树转化成对应的二叉树。','树的链式存储结构略，二叉树略','Joesea Lea',1),(8,'设有一组初始记录关键字序列（K1，K2，…，Kn），要求设计一个算法能够在O(n)的时间复杂度内将线性表划分成两部分，其中左半部分的每个关键字均小于Ki，右半部分的每个关键字均大于等于Ki。','void quickpass(int r[], int s, int t)\r\n{\r\n  int i=s, j=t, x=r[s];\r\n  while(i<j){\r\nwhile (i<j && r[j]>x) j=j-1; if (i<j) {r[i]=r[j];i=i+1;}\r\n    while (i<j && r[i]<x) i=i+1; if (i<j) {r[j]=r[i];j=j-1;}\r\n  }\r\n  r[i]=x;\r\n}\r\n','Joesea Lea',1),(9,'设有两个集合A和集合B，要求设计生成集合C=A∩B的算法，其中集合A、B和C用链式存储结构表示。','typedef struct node {int data; struct node *next;}lklist;\r\nvoid intersection(lklist *ha,lklist *hb,lklist *&hc)\r\n{\r\nlklist *p,*q,*t;\r\nfor(p=ha,hc=0;p!=0;p=p->next)\r\n{  for(q=hb;q!=0;q=q->next) if (q->data==p->data) break;\r\nif(q!=0){ t=(lklist *)malloc(sizeof(lklist)); t->data=p->data;t->next=hc; hc=t;}\r\n}\r\n}\r\n','Joesea Lea',1),(10,'编写从类型为List的线性表L中将第i个元素删除的算法，（假定不需要对i的值进行有效性检查,也不用判别L是否为空表。）\r\nvoid Delete(List& L, int i)\r\n','void Delete(List& L, int i)\r\n      {\r\n           for(int j=i-1;j<L.size-1; j++)\r\n               L.list[j]=L.list[j+1];          //第i个元素的下标为i-1\r\n	       L.size--;\r\n       }\r\n','Joesea Lea',1);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(8) NOT NULL,
  `sno` varchar(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `birthday` date NOT NULL,
  `nation` varchar(50) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  `classid` int(8) NOT NULL,
  `powerid` int(2) NOT NULL,
  `des` text,
  PRIMARY KEY (`id`),
  KEY `student_ibfk_2` (`powerid`),
  KEY `student_ibfk_1` (`classid`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`classid`) REFERENCES `politicsclass` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `student_ibfk_2` FOREIGN KEY (`powerid`) REFERENCES `power` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`sno`,`name`,`birthday`,`nation`,`tel`,`email`,`address`,`password`,`classid`,`powerid`,`des`) values (1,'20094042057','李节祥','1989-07-24','汉','15200792349','319011485@qq.com','湖南郴州','123456',1,1,'好学生');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` int(8) NOT NULL,
  `tno` varchar(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `birthday` date NOT NULL,
  `nation` varchar(50) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `position` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `powerid` int(2) NOT NULL,
  `des` text,
  PRIMARY KEY (`id`),
  KEY `powerid` (`powerid`),
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`powerid`) REFERENCES `power` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`id`,`tno`,`name`,`birthday`,`nation`,`tel`,`email`,`address`,`position`,`password`,`powerid`,`des`) values (1,'00000000001','Joesea Lea','1989-07-24','汉','15200792349','319011485@qq.com','湖南郴州','管理员','12345678',3,'JoeseaLea是超管s');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
