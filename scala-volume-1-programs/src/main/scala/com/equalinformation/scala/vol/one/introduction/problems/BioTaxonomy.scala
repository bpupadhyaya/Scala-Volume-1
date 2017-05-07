package com.equalinformation.scala.vol.one.introduction.problems

/**
  * Created by bpupadhyaya on 4/12/17.
  */
object BioTaxonomy {
  def main(args: Array[String]): Unit = {
    val humanTaxonomy = Map(
                        "Kingdom" -> "Animalia",
                        "Phylum" -> "Chordata",
                        "Class" -> "Mammalia",
                        "Order" -> "Primates",
                        "Family" -> "Hominidae",
                        "Genus" -> "Homo",
                        "Species" -> "H. Sapiens"
                        )
    val dogTaxonomy = Map(
                      "Kingdom" -> "Animalia",
                      "Phylum" -> "Chordata",
                      "Class" -> "Mammalia",
                      "Order" -> "Carnivora",
                      "Family" -> "Canidae",
                      "Genus" -> "Canis",
                      "Species" -> "C. lupus"
                      )
    val pigeonTaxonomy = Map(
                          "Kingdom" -> "Animalia",
                          "Phylum" -> "Chordata",
                          "Class" -> "Aves",
                          "Order" -> "Columb  iformes",
                          "Family" -> "Columbidae",
                          "Genus" -> "Columba",
                          "Species" -> "C. livia"
                        )
    val catTaxonomy = Map(
                      "Kingdom" -> "Animalia",
                      "Phylum" -> "Chordata",
                      "Class" -> "Mammalia",
                      "Order" -> "Carnivora",
                      "Family" -> "Felidae",
                      "Genus" -> "Felis",
                      "Species" -> "F. catus"
                      )
    val taxonomyList = List(humanTaxonomy, dogTaxonomy, pigeonTaxonomy, catTaxonomy)

    var count = 0;
    taxonomyList.foreach(_.values.foreach(x => x match {
      case "Felis" => count += 1
      case _ => count += 0
    }))
    println("Total cat taxonomy found: "+count)

  }
}
