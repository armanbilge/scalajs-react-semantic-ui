package react.semanticui.collections.message

import scala.scalajs.js
import js.|
import js.annotation._
import js.JSConverters._
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import react.common.style._
import react.common._
import react.semanticui._
import react.semanticui.{ raw => suiraw }
import react.semanticui.elements.icon.Icon
import react.semanticui.elements.icon.Icon.IconProps
import japgolly.scalajs.react.vdom.TagMod

final case class Message(
  as:                     js.UndefOr[AsC]                                        = js.undefined,
  attached:               js.UndefOr[MessageAttached]                            = js.undefined,
  className:              js.UndefOr[String]                                     = js.undefined,
  clazz:                  js.UndefOr[Css]                                        = js.undefined,
  color:                  js.UndefOr[SemanticColor]                              = js.undefined,
  compact:                js.UndefOr[Boolean]                                    = js.undefined,
  content:                js.UndefOr[ShorthandS[MessageContent]]                 = js.undefined,
  error:                  js.UndefOr[Boolean]                                    = js.undefined,
  floating:               js.UndefOr[Boolean]                                    = js.undefined,
  header:                 js.UndefOr[ShorthandS[MessageHeader]]                  = js.undefined,
  hidden:                 js.UndefOr[Boolean]                                    = js.undefined,
  icon:                   js.UndefOr[ShorthandSB[Icon]]                          = js.undefined,
  info:                   js.UndefOr[Boolean]                                    = js.undefined,
  list:                   js.UndefOr[Seq[ShorthandS[MessageItem]] | MessageList] = js.undefined,
  negative:               js.UndefOr[Boolean]                                    = js.undefined,
  onDismissE:             js.UndefOr[Message.OnDismiss]                          = js.undefined,
  onDismiss:              js.UndefOr[Callback]                                   = js.undefined,
  positive:               js.UndefOr[Boolean]                                    = js.undefined,
  size:                   js.UndefOr[MessageSize]                                = js.undefined,
  success:                js.UndefOr[Boolean]                                    = js.undefined,
  visible:                js.UndefOr[Boolean]                                    = js.undefined,
  warning:                js.UndefOr[Boolean]                                    = js.undefined,
  override val modifiers: Seq[TagMod]                                            = Seq.empty
) extends GenericComponentPAC[Message.MessageProps, Message] {
  override protected def cprops    = Message.props(this)
  override protected val component = Message.component
  override def addModifiers(modifiers: Seq[TagMod]) = copy(modifiers = this.modifiers ++ modifiers)
}

object Message {
  type OnDismiss = (ReactEvent, MessageProps) => Callback

  @js.native
  @JSImport("semantic-ui-react", "Message")
  object RawComponent extends js.Object

  @js.native
  trait MessageProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native

    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native

    /** An element type to render as (string or function). */
    var as: js.UndefOr[AsT] = js.undefined

    /** A message can be formatted to attach itself to other content. */
    var attached: js.UndefOr[Boolean | String] = js.undefined

    /** Primary content. */
    var children: js.UndefOr[React.Node] = js.undefined

    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined

    /** A message can be formatted to be different colors. */
    var color: js.UndefOr[suiraw.SemanticCOLORS] = js.undefined

    /** A message can only take up the width of its content. */
    var compact: js.UndefOr[Boolean] = js.undefined

    /** Shorthand for primary content. */
    var content: js.UndefOr[suiraw.SemanticShorthandItemS[MessageContent.MessageContentProps]] =
      js.undefined

    /** A message may be formatted to display a negative message. Same as `negative`. */
    var error: js.UndefOr[Boolean] = js.undefined

    /** A message can float above content that it is related to. */
    var floating: js.UndefOr[Boolean] = js.undefined

    /** Shorthand for MessageHeader. */
    var header: js.UndefOr[suiraw.SemanticShorthandItemS[MessageHeader.MessageHeaderProps]] =
      js.undefined

    /** A message can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.undefined

    /** Add an icon by icon name or pass an <Icon /.> */
    var icon: js.UndefOr[suiraw.SemanticShorthandItemSB[IconProps]] = js.undefined

    /** A message may be formatted to display information. */
    var info: js.UndefOr[Boolean] = js.undefined

    /** Array shorthand items for the MessageList. Mutually exclusive with children. */
    var list: js.UndefOr[
      js.Array[suiraw.SemanticShorthandItemS[MessageItem.MessageItemProps]] | MessageList.MessageListProps
    ] =
      js.undefined

    /** A message may be formatted to display a negative message. Same as `error`. */
    var negative: js.UndefOr[Boolean] = js.undefined

    /**
      * A message that the user can choose to hide.
      * Called when the user clicks the "x" icon. This also adds the "x" icon.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onDismiss: js.UndefOr[js.Function2[ReactEvent, MessageProps, Unit]] = js.undefined

    /** A message may be formatted to display a positive message.  Same as `success`. */
    var positive: js.UndefOr[Boolean] = js.undefined

    /** A message can have different sizes. */
    var size: js.UndefOr[suiraw.SemanticSIZES] = js.native

    /** A message may be formatted to display a positive message.  Same as `positive`. */
    var success: js.UndefOr[Boolean] = js.undefined

    /** A message can be set to visible to force itself to be shown. */
    var visible: js.UndefOr[Boolean] = js.undefined

    /** A message may be formatted to display warning messages. */
    var warning: js.UndefOr[Boolean] = js.undefined
  }

  def props(q: Message): MessageProps =
    rawprops(
      q.as,
      q.attached,
      q.className,
      q.clazz,
      q.color,
      q.compact,
      q.content,
      q.error,
      q.floating,
      q.header,
      q.hidden,
      q.icon,
      q.info,
      q.list,
      q.negative,
      q.onDismissE,
      q.onDismiss,
      q.positive,
      q.size,
      q.success,
      q.visible,
      q.warning
    )

  def rawprops(
    as:         js.UndefOr[AsC]                                        = js.undefined,
    attached:   js.UndefOr[MessageAttached]                            = js.undefined,
    className:  js.UndefOr[String]                                     = js.undefined,
    clazz:      js.UndefOr[Css]                                        = js.undefined,
    color:      js.UndefOr[SemanticColor]                              = js.undefined,
    compact:    js.UndefOr[Boolean]                                    = js.undefined,
    content:    js.UndefOr[ShorthandS[MessageContent]]                 = js.undefined,
    error:      js.UndefOr[Boolean]                                    = js.undefined,
    floating:   js.UndefOr[Boolean]                                    = js.undefined,
    header:     js.UndefOr[ShorthandS[MessageHeader]]                  = js.undefined,
    hidden:     js.UndefOr[Boolean]                                    = js.undefined,
    icon:       js.UndefOr[ShorthandSB[Icon]]                          = js.undefined,
    info:       js.UndefOr[Boolean]                                    = js.undefined,
    list:       js.UndefOr[Seq[ShorthandS[MessageItem]] | MessageList] = js.undefined,
    negative:   js.UndefOr[Boolean]                                    = js.undefined,
    onDismissE: js.UndefOr[Message.OnDismiss]                          = js.undefined,
    onDismiss:  js.UndefOr[Callback]                                   = js.undefined,
    positive:   js.UndefOr[Boolean]                                    = js.undefined,
    size:       js.UndefOr[MessageSize]                                = js.undefined,
    success:    js.UndefOr[Boolean]                                    = js.undefined,
    visible:    js.UndefOr[Boolean]                                    = js.undefined,
    warning:    js.UndefOr[Boolean]                                    = js.undefined
  ): MessageProps = {
    val p = as.toJsObject[MessageProps]
    p.as        = as.toJs
    p.attached  = attached.toJs
    p.className = (className, clazz).toJs
    p.color     = color.toJs
    p.compact   = compact
    p.content   = content.toJs
    p.error     = error
    p.floating  = floating
    p.header    = header.toJs
    p.hidden    = hidden
    p.icon      = icon.toJs
    p.info      = info
    p.list = list.map(v =>
      (v: Any) match {
        case s: Seq[_] =>
          s.map(item => compToPropS(item.asInstanceOf[ShorthandS[MessageItem]])).toJSArray
        // .asInstanceOf[raw.SemanticShorthandOrArray[T]]
        case l: MessageList => l.props
      }
    )
    p.negative  = negative
    p.onDismiss = (onDismissE, onDismiss).toJs
    p.positive  = positive
    p.size      = size.toJs
    p.visible   = visible
    p.warning   = warning
    p
  }

  private val component =
    JsComponent[MessageProps, Children.Varargs, Null](RawComponent)

  def apply(modifiers: TagMod*): Message =
    new Message(modifiers = modifiers)
}
