/*
 * © 2017 Stratio Big Data Inc., Sucursal en España. All rights reserved.
 *
 * This software – including all its source code – contains proprietary information of Stratio Big Data Inc., Sucursal en España and may not be revealed, sold, transferred, modified, distributed or otherwise made available, licensed or sublicensed to third parties; nor reverse engineered, disassembled or decompiled, without express written authorization from Stratio Big Data Inc., Sucursal en España.
 */
package com.stratio.sparta.security

case class Resource(resourceType: ResourceType, name: String)

sealed trait ResourceType{
  def name(): String
}

case object InputResource extends ResourceType{
  override def name(): String = "input"
}

case object OutputResource extends ResourceType{
  override def name(): String = "output"
}

case object PolicyResource extends ResourceType{
  override def name(): String = "policy"
}

case object PluginResource extends ResourceType{
  override def name(): String = "plugin"
}

case object DriverResource extends ResourceType{
  override def name(): String = "driver"
}

case object ContextResource extends ResourceType{
  override def name(): String = "context"
}

case object CheckpointResource extends ResourceType{
  override def name(): String = "checkpoint"
}

case object BackupResource extends ResourceType{
  override def name(): String = "backup"
}

case object CatalogResource extends ResourceType{
  override def name(): String = "catalog"
}