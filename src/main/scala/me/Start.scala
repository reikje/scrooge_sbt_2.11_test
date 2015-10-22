package me

import me.common.generated.thrift.User
import me.service.generated.thrift.GetStatsRequest

object Start {
  def main(args: Array[String]) {
    val request = GetStatsRequest(User("john", "doe"))
    println("Works")
  }
}
