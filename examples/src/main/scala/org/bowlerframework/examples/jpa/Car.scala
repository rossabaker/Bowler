package org.bowlerframework.examples.jpa

import reflect.BeanProperty
import javax.persistence._

/**
 * Created by IntelliJ IDEA.
 * User: wfaler
 * Date: 20/02/2011
 * Time: 20:08
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table
case class Car{

  @Id
  @Column
  @GeneratedValue
  @BeanProperty
  var id: Long = 0

  @BeanProperty
  @ManyToOne
  @JoinColumn(name="make_id", nullable=false)
  var make: Make = null

  @Column
  @BeanProperty
  var model: String = null

}