import org.apache.spark._
import org.apache.spark.graphx._
import org.apache.spark.rdd.RDD

GraphLoader.edgeListFile(sc,"data/soc-karate.mtx")