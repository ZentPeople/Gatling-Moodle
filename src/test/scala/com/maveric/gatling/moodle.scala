package com.maveric.gatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class moodle extends Simulation {

	val httpProtocol = http
		.baseUrl("http://13.233.133.114")
		.inferHtmlResources()
		.acceptEncodingHeader("gzip, deflate")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")
  	.silentResources

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
		"Origin" -> "http://13.233.133.114",
		"Proxy-Connection" -> "keep-alive")

	val headers_7 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/json",
		"Origin" -> "http://13.233.133.114",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_10 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://13.233.133.114",
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
		"Origin" -> "http://13.233.133.114",
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

    val uri1 = "http://update.googleapis.com/service/update2/json"
    val uri3 = "http://redirector.gvt1.com/edgedl/release2"
    val uri4 = "http://r4---sn-cvh7knez.gvt1.com/edgedl/release2/InoL8xikh4kmHhn0dVdN-Q_26/AKazB3LBoCjHJWZWENiKn6c"

	val scn = scenario("moodle")
		// Home
		.exec(http("Home_Page")
			.get("/")
			.headers(headers_0)
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
			.body(RawFileBody("com/maveric/gatling/moodle/0007_request.json"))))
		.pause(19)


		// Open Login
		.exec(http("Open_Login_Page")
			.get("/login/index.php")
			.headers(headers_0)
			.resources(http("request_9")
			.post("/lib/ajax/service.php?sesskey=rRfuFN94AY&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0009_request.json"))))
		.pause(21)


		// Login
		.exec(http("Login")
			.post("/login/index.php")
			.headers(headers_10)
			.formParam("anchor", "")
			.formParam("logintoken", "3n7UFnDs3wpwWcwoBHvRQdgXLRReaKEJ")
			.formParam("username", "mohan")
			.formParam("password", "MOhan@11")
			.resources(http("request_11")
			.get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22ariaeventlistpaginationnavdates%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22block_timeline%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_12")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_calendar_get_calendar_monthly_view")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0012_request.json")),
            http("request_13")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_course_get_recent_courses")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0013_request.json")),
            http("request_14")
			.get("/lib/ajax/service-nologin.php?info=core_output_load_fontawesome_icon_map&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_fontawesome_icon_map%22%2C%22args%22%3A%5B%5D%7D%5D")
			.headers(headers_11),
            http("request_15")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0015_request.json")),
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
            http("request_23")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_course_get_enrolled_courses_by_timeline_classification")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0023_request.json")),
            http("request_24")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_calendar_get_action_events_by_timesort")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0024_request.json")),
            http("request_25")
			.get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core_course%22%2C%22template%22%3A%22no-courses%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_26")
			.get("/theme/image.php/boost/block_myoverview/1574938282/courses")
			.headers(headers_1)))
		.pause(13)



		// Site Adminis
		.exec(http("Click_on_Site_Administration")
			.get("/admin/search.php")
			.headers(headers_0)
			.resources(http("request_28")
			.get("/theme/yui_combo.php?m/1574938282/core/formchangechecker/formchangechecker-min.js")
			.headers(headers_2),
            http("request_29")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0029_request.json"))))
		.pause(18)



		// Click on add course
		.exec(http("Click_On_Add_Course")
			.get("/course/edit.php?category=0")
			.headers(headers_0)
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
            http("request_36")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0036_request.json")),
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
            http("request_47")
			.post("/lib/editor/atto/autosave-ajax.php")
			.headers(headers_47)
			.formParam("actions[0][contextid]", "3")
			.formParam("actions[0][action]", "resume")
			.formParam("actions[0][draftid]", "763635804")
			.formParam("actions[0][elementid]", "id_summary_editor")
			.formParam("actions[0][pageinstance]", "yui_3_17_2_1_1575441295142_290")
			.formParam("actions[0][pagehash]", "ec8fc89fc09e06957278a594f688505604edcadf")
			.formParam("sesskey", "jAJFCT7m4r"),
            http("request_48")
			.get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22pix_icon_fontawesome%22%2C%22themename%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
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
            http("request_59")
			.post("/repository/draftfiles_ajax.php?action=list")
			.headers(headers_47)
			.formParam("sesskey", "jAJFCT7m4r")
			.formParam("client_id", "5de7538ec5b6c")
			.formParam("filepath", "/")
			.formParam("itemid", "285991687"),
            http("request_60")
			.get("/theme/image.php/boost/theme/1574938282/fp/path_folder")
			.headers(headers_1),
            http("request_61")
			.get("/theme/image.php/boost/theme/1574938282/fp/dnd_arrow")
			.headers(headers_1)))
		.pause(23)


		// Submit Data
		.exec(http("Submit_Course_Data")
			.post(uri1 + "?cup2key=9:3645185050&cup2hreq=95ef513c59e3839f53d1497fe1c3838387b8efdf8385f37bc0daffc24311db92")
			.headers(headers_62)
			.body(RawFileBody("com/maveric/gatling/moodle/0062_request.json")))
		.pause(1)
		.exec(http("request_63")
			.head(uri3 + "/chrome_component/AN_9AzJXQZzYTbhwfBE0Bas_5551/By-AX1T1bFXYHS17mQ3lww")
			.headers(headers_63))
		.pause(4)
		.exec(http("request_64")
			.get(uri3 + "/chrome_component/AN_9AzJXQZzYTbhwfBE0Bas_5551/By-AX1T1bFXYHS17mQ3lww")
			.headers(headers_64))
		.pause(3)
		.exec(http("request_65")
			.get(uri3 + "/chrome_component/AN_9AzJXQZzYTbhwfBE0Bas_5551/By-AX1T1bFXYHS17mQ3lww")
			.headers(headers_65))
		.pause(2)
		.exec(http("request_66")
			.get(uri3 + "/chrome_component/AN_9AzJXQZzYTbhwfBE0Bas_5551/By-AX1T1bFXYHS17mQ3lww")
			.headers(headers_66))
		.pause(1)
		.exec(http("request_67")
			.head(uri3 + "/InoL8xikh4kmHhn0dVdN-Q_26/AKazB3LBoCjHJWZWENiKn6c")
			.headers(headers_63)
			.resources(http("request_68")
			.head(uri4 + "?mip=49.249.248.170&mvi=3&pl=24&shardbypass=yes&redirect_counter=1&rm=sn-h55ee7e&req_id=fc61ab8c23f47a49&cms_redirect=yes&ipbypass=yes&mm=28&mn=sn-cvh7knez&ms=nvh&mt=1575440848&mv=u")
			.headers(headers_63),
            http("request_69")
			.get(uri3 + "/InoL8xikh4kmHhn0dVdN-Q_26/AKazB3LBoCjHJWZWENiKn6c")
			.headers(headers_63)))
		.pause(1)
		.exec(http("request_70")
			.post(uri1)
			.headers(headers_70)
			.body(RawFileBody("com/maveric/gatling/moodle/0070_request.json")))
		.pause(4)
		.exec(http("Submit_Course_Data")
			.post("/lib/editor/atto/autosave-ajax.php")
			.headers(headers_47)
			.formParam("actions[0][action]", "reset")
			.formParam("actions[0][contextid]", "3")
			.formParam("actions[0][elementid]", "id_summary_editor")
			.formParam("actions[0][pageinstance]", "yui_3_17_2_1_1575441295142_290")
			.formParam("actions[0][pagehash]", "ec8fc89fc09e06957278a594f688505604edcadf")
			.formParam("sesskey", "jAJFCT7m4r")
			.resources(http("request_72")
			.post("/course/edit.php")
			.headers(headers_10)
			.formParam("returnto", "0")
			.formParam("returnurl", "http://13.233.133.114/course/")
			.formParam("mform_isexpanded_id_descriptionhdr", "1")
			.formParam("addcourseformatoptionshere", "")
			.formParam("id", "")
			.formParam("sesskey", "jAJFCT7m4r")
			.formParam("_qf__course_edit_form", "1")
			.formParam("mform_isexpanded_id_general", "1")
			.formParam("mform_isexpanded_id_courseformathdr", "0")
			.formParam("mform_isexpanded_id_appearancehdr", "0")
			.formParam("mform_isexpanded_id_filehdr", "0")
			.formParam("mform_isexpanded_id_completionhdr", "0")
			.formParam("mform_isexpanded_id_groups", "0")
			.formParam("mform_isexpanded_id_rolerenaming", "0")
			.formParam("mform_isexpanded_id_tagshdr", "0")
			.formParam("fullname", "Course_Full_Name")
			.formParam("shortname", "Course_Short_Name")
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
			.formParam("saveanddisplay", "Save and display"),
            http("request_73")
			.get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22enroluserscohorts%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22enrol_manual%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22enrolusers%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22enrol_manual%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_74")
			.get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22userfilterplaceholder%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22moodle%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22nofiltersapplied%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22moodle%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_75")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0075_request.json")),
            http("request_76")
			.get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core%22%2C%22template%22%3A%22modal_save_cancel%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_77")
			.get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22savechanges%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22cancel%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11)))
		.pause(26)


		// Click Proceed to course content
		.exec(http("Click_On_Proceed_To_Course_Content")
			.get("/course/view.php?id=4")
			.headers(headers_0)
			.resources(http("request_79")
			.get("/lib/javascript.php/1574938282/course/completion.js")
			.headers(headers_2),
            http("request_80")
			.post("/lib/ajax/service.php?sesskey=jAJFCT7m4r&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0080_request.json"))))
		.pause(14)



		// Logout
		.exec(http("Logout")
			.get("/login/logout.php?sesskey=jAJFCT7m4r")
			.headers(headers_0)
			.resources(http("request_82")
			.post("/lib/ajax/service.php?sesskey=ND8XGuV0Hi&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/moodle/0082_request.json"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
		.disablePauses
}