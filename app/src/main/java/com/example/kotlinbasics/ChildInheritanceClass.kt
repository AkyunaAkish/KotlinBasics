package com.example.kotlinbasics

open class ChildInheritanceClass : BaseInheritanceClass() {
    override fun role() {
        // calls original logic from parent class
        super.role()

        println("Knight of the house of base class")
    }
}