package com.comosystoreply.livingdiagrams.ld4j

import com.github.ajalt.clikt.core.CliktCommand
import org.apache.commons.csv.CSVParser

class AwProcessor: CliktCommand() {
    override fun run() {
        echo("Hello world")
    }
}

fun main(args: Array<String>) {
    AwProcessor().main(args)
}
