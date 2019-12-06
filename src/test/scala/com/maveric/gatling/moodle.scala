package com.maveric.gatling

import scala.concurrent.duration._
import com.maveric.gatling._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class moodle extends Simulation {

  val environemtURL = "http://52.66.244.207"
  val httpProtocol = http
    .baseUrl(environemtURL)
    .inferHtmlResources()
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")
    .silentResources
    .proxy(Proxy("127.0.0.1", 8888))

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Proxy-Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1")
  val headers_1 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Proxy-Connection" -> "keep-alive")
  val headers_2 = Map(
    "Accept" -> "*/*",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Proxy-Connection" -> "keep-alive")
  val headers_3 = Map(
    "Accept" -> "*/*",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Origin" -> environemtURL,
    "Proxy-Connection" -> "keep-alive")
  val headers_7 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Content-Type" -> "application/json",
    "Origin" -> environemtURL,
    "Proxy-Connection" -> "keep-alive",
    "X-Requested-With" -> "XMLHttpRequest")
  val headers_10 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Origin" -> environemtURL,
    "Proxy-Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1")
  val headers_11 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Content-Type" -> "application/json",
    "Proxy-Connection" -> "keep-alive",
    "X-Requested-With" -> "XMLHttpRequest")
  val headers_35 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Proxy-Connection" -> "keep-alive")
  val headers_47 = Map(
    "Accept" -> "*/*",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> environemtURL,
    "Proxy-Connection" -> "keep-alive",
    "X-Requested-With" -> "XMLHttpRequest")
  val headers_62 = Map(
    "Content-Type" -> "application/json",
    "Proxy-Connection" -> "keep-alive",
    "X-Goog-Update-AppId" -> "ihnlcenocehgdaegdmhbidjhnhdchfmm,llkgjffcdpffmhiakmfcdcblohccpfmo,giekcmmlnklenlaomppkphknjmnnpneh,khaoiebndkojlmppeemjhbpbandiljpe,aemomkdncapdnfajjbbcbdebjljbpmpj,gcmjkmgdlgnkkcocmoeiminaijmmjnii,ehgidpndbllacpjalkiimkbadgjfnnmc,hfnkpimlhhgieaddgfemjhofmfblmnib,gkmgaooipdjhmangpemjhigmamcehddo,mimojjlkmoijpicakmndhoigimigcmbb,oimompecagnajdejgnnjijobebaeigek,jflookgnkcckhobaglndicnbbgbonegd,hnimpnehoodheedghdeeijklkeaacbdc,copjbmjbojbakpaedmpkhmiplmmehfck",
    "X-Goog-Update-Interactivity" -> "bg",
    "X-Goog-Update-Updater" -> "chrome-78.0.3904.108")
  val headers_63 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "identity",
    "Proxy-Connection" -> "Keep-Alive",
    "User-Agent" -> "Microsoft BITS/7.7")
  val headers_64 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "identity",
    "Proxy-Connection" -> "Keep-Alive",
    "Range" -> "bytes=0-5690",
    "User-Agent" -> "Microsoft BITS/7.7")
  val headers_65 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "identity",
    "Proxy-Connection" -> "Keep-Alive",
    "Range" -> "bytes=5691-13739",
    "User-Agent" -> "Microsoft BITS/7.7")
  val headers_66 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "identity",
    "Proxy-Connection" -> "Keep-Alive",
    "Range" -> "bytes=13740-20461",
    "User-Agent" -> "Microsoft BITS/7.7")
  val headers_70 = Map(
    "Content-Type" -> "application/json",
    "Proxy-Connection" -> "keep-alive")
  val Custromheader_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Proxy-Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1")
  val Custromheader_2 = Map(
    "Accept" -> "*/*",
    "Proxy-Connection" -> "keep-alive")
  val Custromheader_10 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
    "Origin" -> "http://52.66.244.207",
    "Proxy-Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1")
  val Custromheader_31 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Proxy-Connection" -> "keep-alive")

  val uri1 = "http://update.googleapis.com/service/update2/json"
  val uri3 = "http://redirector.gvt1.com/edgedl/release2"
  val uri4 = "http://r4---sn-cvh7knez.gvt1.com/edgedl/release2/InoL8xikh4kmHhn0dVdN-Q_26/AKazB3LBoCjHJWZWENiKn6c"
  val csv_UserData = csv("userdata.csv").circular

  val r = new scala.util.Random

  object Login {
    var login =  group("Homepage") {
      exec(http("Home_Page")
        .get("/")
        .headers(headers_0)
        .check(regex("Available courses").exists)
        .resources(http("request_1")
          .get("/theme/image.php/boost/core/1574938282/i/course")
          .headers(headers_1),
          http("request_2")
            .get("/theme/yui_combo.php?m/1574938282/core/event/event-min.js&m/1574938282/filter_mathjaxloader/loader/loader-min.js")
            .headers(headers_2),
          http("request_3")
            .get("/theme/font.php/boost/core/1574938282/fontawesome-webfont.woff2?v=4.7.0")
            .headers(headers_3),
          http("request_4")
            .get("/lib/requirejs.php/1574938282/core/first.js")
            .headers(headers_2),
          http("request_5")
            .get("/lib/javascript.php/1574938282/lib/jquery/jquery-3.4.1.min.js")
            .headers(headers_2),
          http("request_6")
            .get("/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js")
            .headers(headers_2),
          http("request_7")
            .post("/lib/ajax/service.php?sesskey=rRfuFN94AY&info=core_fetch_notifications")
            .headers(headers_7)
            .body(StringBody("""{"index":0,"methodname":"core_fetch_notifications","args":{"contextid":2222}}"""))))
    }
      .pause(5)


      // Open Login
      .group("Open Login Page") {
        exec(http("Open_Login_Page")
          .get("/login/index.php")
          .headers(headers_0)
          .check(regex("input type=\"hidden\" name=\"logintoken\" value=\"(.+?)\"").saveAs("LoginToken"))
          .check(regex("Remember username").exists)
        )
      }

      .pause(5)

      // Login
      .group("Login") {
        feed(csv_UserData)
          .exec(http("Login")
            .post("/login/index.php")
            .headers(headers_10)
            .formParam("anchor", "")
            .formParam("logintoken", "${LoginToken}")
            .formParam("username", "${username}")
            .formParam("password", "${password}")

            .check(regex("This page should automatically redirect|Recently accessed courses").exists)
            .resources(http("request_11")
              .get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22ariaeventlistpaginationnavdates%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22block_timeline%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
              .headers(headers_11),
              http("request_14")
                .get("/lib/ajax/service-nologin.php?info=core_output_load_fontawesome_icon_map&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_fontawesome_icon_map%22%2C%22args%22%3A%5B%5D%7D%5D")
                .headers(headers_11),
              http("request_16")
                .get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22ariaeventlistpagelimit%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22block_timeline%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_17")
                .get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22calendar%22%2C%22template%22%3A%22modal_event_form%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_18")
                .get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies,core_output_load_template_with_dependencies,core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22tool_usertours%22%2C%22template%22%3A%22resettour%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22paged_content%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A2%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core_calendar%22%2C%22template%22%3A%22month_mini%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_19")
                .get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22pix_icon_fontawesome%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_20")
                .get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22save%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22loading%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A2%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22closebuttontitle%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_21")
                .get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22show%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_22")
                .get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringparams%22%3A%5B%5D%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_25")
                .get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core_course%22%2C%22template%22%3A%22no-courses%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
                .headers(headers_11),
              http("request_26")
                .get("/theme/image.php/boost/block_myoverview/1574938282/courses")
                .headers(headers_1)))
      }
      .pause(5)



      // Site Adminis
      .group("Click on site Administraton") {
        exec(http("Click_on_Site_Administration")
          .get("/admin/search.php")
          .headers(headers_0)
          .check(regex("Site administration").exists)
          .resources(http("request_28")
            .get("/theme/yui_combo.php?m/1574938282/core/formchangechecker/formchangechecker-min.js")
            .headers(headers_2)))
      }
      .pause(5)
  }
  object CreateCourse {
    val createCourse = repeat(1){
      group("01_Click_On_Add_Course") {

      exec(http("01_Click_On_Add_Course")
        .get("/course/edit.php?category=0")
        .headers(headers_0)
        .check(regex("\"sesskey\":\"(.+?)\"").saveAs("sesskey"))
        .check(regex("Add a new course").exists)
        .resources(http("request_31")
          .get("/theme/image.php/boost/core/1574938282/t/collapsed")
          .headers(headers_1),
          http("request_32")
            .get("/theme/yui_combo.php?3.17.2/event-simulate/event-simulate-min.js&3.17.2/async-queue/async-queue-min.js&3.17.2/gesture-simulate/gesture-simulate-min.js&3.17.2/node-event-simulate/node-event-simulate-min.js&m/1574938282/course/formatchooser/formatchooser-min.js")
            .headers(headers_2),
          http("request_33")
            .get("/theme/yui_combo.php?m/1574938282/form/shortforms/shortforms-min.js")
            .headers(headers_2),
          http("request_34")
            .get("/theme/image.php/boost/core/1574938282/t/expanded")
            .headers(headers_1),
          http("request_35")
            .get("/theme/yui_combo.php?3.17.2/cssgrids/cssgrids-min.css&3.17.2/calendar-base/assets/skins/sam/calendar-base.css&3.17.2/calendarnavigator/assets/skins/sam/calendarnavigator.css&3.17.2/calendar/assets/skins/sam/calendar.css")
            .headers(headers_35),
          http("request_37")
            .get("/theme/yui_combo.php?3.17.2/intl/intl-min.js&3.17.2/calendar-base/lang/calendar-base_en.js&3.17.2/datatype-date-parse/datatype-date-parse-min.js&3.17.2/datatype-date-format/lang/datatype-date-format_en-US.js&3.17.2/datatype-date-format/datatype-date-format-min.js&3.17.2/datatype-date-math/datatype-date-math-min.js&3.17.2/calendar-base/calendar-base-min.js&3.17.2/plugin/plugin-min.js&3.17.2/calendarnavigator/calendarnavigator-min.js&3.17.2/calendar/calendar-min.js&m/1574938282/form/dateselector/dateselector-min.js")
            .headers(headers_2),
          http("request_38")
            .get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22form_autocomplete_input%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
            .headers(headers_11),
          http("request_39")
            .get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies,core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22form_autocomplete_suggestions%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22form_autocomplete_selection%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
            .headers(headers_11),
          http("request_40")
            .get("/theme/yui_combo.php?3.17.2/cssbutton/cssbutton-min.css&3.17.2/tabview/assets/skins/sam/tabview.css&m/1574938282/atto_html/codemirror/codemirror.css")
            .headers(headers_35),
          http("request_41")
            .get("/theme/yui_combo.php?m/1574938282/atto_html/button/button-min.js")
            .headers(headers_2),
          http("request_42")
            .get("/theme/yui_combo.php?m/1574938282/core/handlebars/handlebars-min.js&3.17.2/timers/timers-min.js&3.17.2/querystring-stringify/querystring-stringify-min.js&m/1574938282/editor_atto/editor/editor-min.js&m/1574938282/editor_atto/menu/menu-min.js&m/1574938282/editor_atto/plugin/plugin-min.js&m/1574938282/atto_collapse/button/button-min.js&m/1574938282/atto_title/button/button-min.js&m/1574938282/atto_bold/button/button-min.js&m/1574938282/atto_italic/button/button-min.js&m/1574938282/atto_unorderedlist/button/button-min.js&m/1574938282/atto_orderedlist/button/button-min.js&m/1574938282/atto_link/button/button-min.js&m/1574938282/atto_image/button/button-min.js&m/1574938282/atto_media/button/button-min.js&m/1574938282/atto_recordrtc/button/button-min.js&m/1574938282/atto_recordrtc/recording/recording-min.js&m/1574938282/atto_managefiles/button/button-min.js&m/1574938282/atto_h5p/button/button-min.js&m/1574938282/atto_underline/button/button-min.js&m/1574938282/atto_strike/button/button-min.js")
            .headers(headers_2),
          http("request_43")
            .get("/theme/yui_combo.php?3.17.2/datatype-xml-parse/datatype-xml-parse-min.js&3.17.2/io-xdr/io-xdr-min.js&3.17.2/io-form/io-form-min.js&3.17.2/io-upload-iframe/io-upload-iframe-min.js&3.17.2/queue-promote/queue-promote-min.js&3.17.2/io-queue/io-queue-min.js&3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js&3.17.2/node-event-html5/node-event-html5-min.js&m/1574938282/core/widget/widget-focusafterclose-min.js&m/1574938282/core/lockscroll/lockscroll-min.js&m/1574938282/core/notification/notification-dialogue-min.js&m/1574938282/core/notification/notification-confirm-min.js&m/1574938282/editor_atto/rangy/rangy-min.js&3.17.2/handlebars-base/handlebars-base-min.js&3.17.2/handlebars-compiler/handlebars-compiler-min.js")
            .headers(headers_2),
          http("request_44")
            .get("/theme/yui_combo.php?m/1574938282/atto_subscript/button/button-min.js&m/1574938282/atto_superscript/button/button-min.js&m/1574938282/atto_align/button/button-min.js&m/1574938282/atto_indent/button/button-min.js&3.17.2/arraylist/arraylist-min.js&3.17.2/widget-parent/widget-parent-min.js&3.17.2/widget-child/widget-child-min.js&3.17.2/tabview-base/tabview-base-min.js&3.17.2/node-focusmanager/node-focusmanager-min.js&3.17.2/tabview/tabview-min.js&3.17.2/array-extras/array-extras-min.js&m/1574938282/atto_equation/button/button-min.js&m/1574938282/atto_charmap/button/button-min.js&m/1574938282/atto_table/button/button-min.js&m/1574938282/atto_clear/button/button-min.js&m/1574938282/atto_undo/button/button-min.js&m/1574938282/atto_accessibilitychecker/button/button-min.js&m/1574938282/atto_accessibilityhelper/button/button-min.js&3.17.2/promise/promise-min.js&m/1574938282/atto_html/beautify/beautify-min.js&m/1574938282/atto_html/codemirror/codemirror-min.js")
            .headers(headers_2),
          http("request_45")
            .get("/theme/image.php/boost/core/1574938282/i/info")
            .headers(headers_1),
          http("request_46")
            .get("/theme/image.php/boost/core/1574938282/i/warning")
            .headers(headers_1),
          http("request_49")
            .get("/theme/image.php/boost/atto_h5p/1574938282/icon")
            .headers(headers_1),
          http("request_50")
            .get("/theme/yui_combo.php?3.17.2/datatable-base/assets/skins/sam/datatable-base.css&3.17.2/datatable-message/assets/skins/sam/datatable-message.css&3.17.2/datatable-sort/assets/skins/sam/datatable-sort.css&3.17.2/resize-base/assets/skins/sam/resize-base.css")
            .headers(headers_35),
          http("request_51")
            .get("/theme/yui_combo.php?3.17.2/dd-drop-plugin/dd-drop-plugin-min.js&3.17.2/dd-delegate/dd-delegate-min.js&3.17.2/resize-base/resize-base-min.js&3.17.2/resize-plugin/resize-plugin-min.js&m/1574938282/core_filepicker/core_filepicker.js")
            .headers(headers_2),
          http("request_52")
            .get("/lib/javascript.php/1574938282/repository/filepicker.js")
            .headers(headers_2),
          http("request_53")
            .get("/theme/yui_combo.php?3.17.2/json-stringify/json-stringify-min.js&2in3/2.9.0/build/yui2-treeview/yui2-treeview-min.js&3.17.2/cookie/cookie-min.js&3.17.2/array-invoke/array-invoke-min.js&3.17.2/model/model-min.js&3.17.2/model-list/model-list-min.js&3.17.2/datatable-core/datatable-core-min.js&3.17.2/view/view-min.js&3.17.2/datatable-head/datatable-head-min.js&3.17.2/datatable-body/datatable-body-min.js&3.17.2/datatable-table/datatable-table-min.js&3.17.2/datatable-base/datatable-base-min.js&3.17.2/datatable-column-widths/datatable-column-widths-min.js&3.17.2/datatable-message/lang/datatable-message_en.js&3.17.2/datatable-message/datatable-message-min.js&3.17.2/datatable-mutable/datatable-mutable-min.js&3.17.2/datatable-sort/lang/datatable-sort_en.js&3.17.2/datatable-sort/datatable-sort-min.js&3.17.2/datasource-local/datasource-local-min.js&3.17.2/datatable-datasource/datatable-datasource-min.js&3.17.2/dd-ddm/dd-ddm-min.js&3.17.2/dd-ddm-drop/dd-ddm-drop-min.js&3.17.2/dd-drop/dd-drop-min.js")
            .headers(headers_2),
          http("request_54")
            .get("/theme/yui_combo.php?2in3/2.9.0/build/yui2-skin-sam-treeview/assets/skins/sam/yui2-skin-sam-treeview-min.css")
            .headers(headers_35),
          http("request_55")
            .get("/theme/yui_combo.php?2in3/2.9.0/build/yui2-yahoo/yui2-yahoo-min.js&2in3/2.9.0/build/yui2-dom/yui2-dom-min.js&2in3/2.9.0/build/yui2-event/yui2-event-min.js")
            .headers(headers_2),
          http("request_56")
            .get("/lib/javascript.php/1574938282/lib/form/dndupload.js")
            .headers(headers_2),
          http("request_57")
            .get("/lib/javascript.php/1574938282/lib/form/filemanager.js")
            .headers(headers_2),
          http("request_58")
            .get("/lib/javascript.php/1574938282/lib/form/form.js")
            .headers(headers_2),
          http("request_61")
            .get("/theme/image.php/boost/theme/1574938282/fp/dnd_arrow")
            .headers(headers_1)))
    }
      .pause(5)


      // Submit Data
      .group("01_Subit Data") {
        exec(http("autosave")
          .post("/lib/editor/atto/autosave-ajax.php")
          .headers(headers_47)
          .formParam("actions[0][action]", "reset")
          .formParam("actions[0][contextid]", "3")
          .formParam("actions[0][elementid]", "id_summary_editor")
          .formParam("actions[0][pageinstance]", "yui_3_17_2_1_1575441295142_290")
          .formParam("actions[0][pagehash]", "ec8fc89fc09e06957278a594f688505604edcadf")
          .formParam("sesskey", "${sesskey}")
          .silent
          .resources(http("Submit_Course_Data")
            .post("/course/edit.php")
            .headers(headers_10)
            .notSilent
            .formParam("returnto", "0")
            .formParam("returnurl", "http://52.66.244.207/course/")
            .formParam("mform_isexpanded_id_descriptionhdr", "1")
            .formParam("addcourseformatoptionshere", "")
            .formParam("id", "")
            .formParam("sesskey", "${sesskey}")
            .formParam("_qf__course_edit_form", "1")
            .formParam("mform_isexpanded_id_general", "1")
            .formParam("mform_isexpanded_id_courseformathdr", "0")
            .formParam("mform_isexpanded_id_appearancehdr", "0")
            .formParam("mform_isexpanded_id_filehdr", "0")
            .formParam("mform_isexpanded_id_completionhdr", "0")
            .formParam("mform_isexpanded_id_groups", "0")
            .formParam("mform_isexpanded_id_rolerenaming", "0")
            .formParam("mform_isexpanded_id_tagshdr", "0")
            .formParam("fullname", session => "Course_" + r.nextInt(1000).toString)
            .formParam("shortname", session => "Short Name" + r.nextInt(1000).toString)
            .formParam("category", "1")
            .formParam("visible", "1")
            .formParam("startdate[day]", "5")
            .formParam("startdate[month]", "12")
            .formParam("startdate[year]", "2019")
            .formParam("startdate[hour]", "0")
            .formParam("startdate[minute]", "0")
            .formParam("enddate[day]", "4")
            .formParam("enddate[month]", "12")
            .formParam("enddate[year]", "2020")
            .formParam("enddate[hour]", "0")
            .formParam("enddate[minute]", "0")
            .formParam("enddate[enabled]", "1")
            .formParam("idnumber", "")
            .formParam("summary_editor[text]", "<p>Description</p>")
            .formParam("summary_editor[format]", "1")
            .formParam("summary_editor[itemid]", "763635804")
            .formParam("overviewfiles_filemanager", "285991687")
            .formParam("format", "topics")
            .formParam("numsections", "4")
            .formParam("hiddensections", "0")
            .formParam("coursedisplay", "0")
            .formParam("lang", "")
            .formParam("newsitems", "5")
            .formParam("showgrades", "1")
            .formParam("showreports", "0")
            .formParam("maxbytes", "0")
            .formParam("enablecompletion", "1")
            .formParam("groupmode", "0")
            .formParam("groupmodeforce", "0")
            .formParam("defaultgroupingid", "0")
            .formParam("role_1", "")
            .formParam("role_2", "")
            .formParam("role_3", "")
            .formParam("role_4", "")
            .formParam("role_5", "")
            .formParam("role_6", "")
            .formParam("role_7", "")
            .formParam("role_8", "")
            .formParam("tags", "_qf__force_multiselect_submission")
            .formParam("saveanddisplay", "Save and display")
            .check(regex("id=(.+?)&").saveAs("CourseID"))
            .check(regex("This page should automatically redirect|Number of participants: 0").exists),
            http("request_73")
              .get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22enroluserscohorts%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22enrol_manual%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22enrolusers%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22enrol_manual%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
              .headers(headers_11),
            http("request_74")
              .get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22userfilterplaceholder%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22moodle%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22nofiltersapplied%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22moodle%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
              .headers(headers_11),
            http("request_76")
              .get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22modal_save_cancel%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
              .headers(headers_11),
            http("request_77")
              .get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22savechanges%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22cancel%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
              .headers(headers_11)))
      }
      .pause(5)


      // Click Proceed to course content
      .group("01_Click On proceed to course content") {
        exec(http("Click_On_Proceed_To_Course_Content")
          .get("/course/view.php?id=${CourseID}")
          .headers(headers_0)
          .check(regex("Topic outline").exists)
          .resources(http("request_79")
            .get("/lib/javascript.php/1574938282/course/completion.js")
            .headers(headers_2)))
          .pause(5)
      }
  }
  }
  object DeleteCourse {
  val deleteCourse = repeat(1){
    group("02_Click on manage Cources") {
      exec(http("Manage Cources")
        .get("/course/management.php")
        .headers(Custromheader_0)
        .check(regex("\"sesskey\":\"(.+?)\"").saveAs("sesskey"))
        .check(regex("delete\\.php\\?id=(.+?)\"").findRandom.saveAs("CourseNumber"))
        .check(regex("Course and category management").exists)
        .resources(http("request_31")
          .get("/theme/yui_combo.php?3.17.2/cssbutton/cssbutton-min.css")
          .headers(Custromheader_31),
          http("request_32")
            .get("/theme/yui_combo.php?m/1574938282/core/widget/widget-focusafterclose-min.js&3.17.2/plugin/plugin-min.js&m/1574938282/core/lockscroll/lockscroll-min.js&m/1574938282/core/notification/notification-dialogue-min.js&m/1574938282/core/notification/notification-exception-min.js&3.17.2/dd-constrain/dd-constrain-min.js&3.17.2/dd-proxy/dd-proxy-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/dd-ddm/dd-ddm-min.js&3.17.2/dd-ddm-drop/dd-ddm-drop-min.js&3.17.2/dd-drop/dd-drop-min.js&3.17.2/dd-drop-plugin/dd-drop-plugin-min.js&3.17.2/dd-delegate/dd-delegate-min.js&m/1574938282/course/management/management-min.js")
            .headers(Custromheader_2),
          http("request_33")
            .get("/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js")
            .headers(Custromheader_2)))
    }
      .pause(5)


      // Delete a course
      .group("02_Click on delete Button") {

        exec(http("request_35")
          .get("/course/delete.php?id=${CourseNumber}")
          .headers(Custromheader_0)
          .check(regex("Are you absolutely sure you want to completely delete this course and all the data it contains?").exists)
          .check(regex("\" name=\"delete\" value=\"(.+?)\"").saveAs("DeleteID"))
        )
      }
      .pause(5)


      // Confirm delete
      .group("02_Confirm Delete") {
        exec(http("Confirm Delete")
          .post("/course/delete.php")
          .headers(Custromheader_10)
          .formParam("id", "${CourseNumber}")
          .formParam("delete", "${DeleteID}")
          .formParam("sesskey", "${sesskey}")
          .check(regex("has been completely deleted").exists)
        )
      }
      .pause(5)
      // Click Continue
      .group("02_Click Continue") {
        exec(http("request_39")
          .get("/course/management.php?categoryid=1")
          .headers(Custromheader_0)
          .check(regex("Course and category management").exists)
        )
      }
      .pause(5)
  }}
  object Logout{
    var logout = group("Logout") {

      exec(http("Logout")
        .get("/login/logout.php?sesskey=${sesskey}")
        .headers(headers_0))
    }
  }
  val createContent = scenario("CreateContent").exec(Login.login,CreateCourse.createCourse,Logout.logout)
  val deleteContent = scenario("DeleteContent").exec(Login.login,DeleteCourse.deleteCourse,Logout.logout)

  setUp(
    createContent.inject(rampUsers(10) during(100)),
    deleteContent.inject(rampUsers(10) during(100))
  ).protocols(httpProtocol)

}