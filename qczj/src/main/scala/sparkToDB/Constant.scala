package sparkToDB

/**
  * Created by cluster on 2016/12/19.
  */
trait Constant {
  val HBASE_ZOOKKER_QUORUM = "192.168.31.61,192.168.31.62,192.168.31.63"
  val HBASE_ZOOKKER_PROPERTY_CLIENTPORT = "2181"
  val ZOOKEEPER_ZNODE_PARENT = "/hbase-unsecure"
  val SPARK_MYSQL_WEIBO_TOPIC = "weibo_content2"
  val SPARK_MYSQL_WEIBO_BROKER = "192.168.31.6:9092"
  val SPARK_HBASE_WEIBO_TOPIC = "weibo_content2"
  val SPARK_HBASE_WEIBO_BROKER = "192.168.31.6:9092"
  val SPARK_MYSQL_AUTOHOME_KOUBEI_TOPIC = "autohome_koubei"
  val SPARK_MYSQL_AUTOHOME_KOUBEI_BROKER = "192.168.31.6:9092"
  val SPARK_HBASE_AUTOHOME_KOUBEI_TOPIC = "autohome_koubei"
  val SPARK_HBASE_AUTOHOME_KOUBEI_BROKER = "192.168.31.6:9092"


  val SPARK_MYSQL_AUTOHOME_KOUBEI_JDBC_URL = "jdbc:mysql://192.168.31.7:3306/qczjtest?useUnicode=true&characterEncoding=UTF-8"
  val SPARK_MYSQL_AUTOHOME_KOUBEI_JDBC_USER = "root"
  val SPARK_MYSQL_AUTOHOME_KOUBEI_JDBC_PASSWORD = "dp12345678"


  val SPARK_MYSQL_WEIBO_JDBC_URL = "jdbc:mysql://192.168.31.7:3306/qczjtest?useUnicode=true&characterEncoding=UTF-8"
  val SPARK_MYSQL_WEIBO_JDBC_USER = "root"
  val SPARK_MYSQL_WEIBO_JDBC_PASSWORD = "dp12345678"

  val SPARK_HBASE_AUTOHOME_KOUBEI_TABLENAME = "autohome_koubei"
  val SPARK_HBASE_AUTOHOME_KOUBEI_COLUMNFAMILY = "qczj"


  val SPARK_HBASE_WEIBO_TABLENAME = "weibo_text"
  val SPARK_HBASE_WEIBO_COLUMNFAMILY = "wb"
}
