package com.example.kotlinbasics

// open allows this class to be inherited from
open class BaseInheritanceClass {
    // open allows this function to be overridden by child classes
    open fun role() {
        println("Member of the house base class")
    }

    fun coreValues() {
        println("Core values of house base class")
    }
}