/*
 * Copyright (C) 2009-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.http.impl.server

import scala.language.implicitConversions
import scala.concurrent.Future
import akka.http.javadsl.{ server ⇒ js }
import akka.http.scaladsl.{ server ⇒ ss }

/**
 * INTERNAL API
 */
private[http] class RouteResultImpl(val underlying: Future[ss.RouteResult]) extends js.RouteResult
/**
 * INTERNAL API
 */
private[http] object RouteResultImpl {
  implicit def autoConvert(result: Future[ss.RouteResult]): js.RouteResult =
    new RouteResultImpl(result)
}