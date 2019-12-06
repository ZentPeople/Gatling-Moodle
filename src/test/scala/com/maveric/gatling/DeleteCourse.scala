package com.maveric.gatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class DeleteCourse extends Simulation {

	val httpProtocol = http
		.baseUrl("http://52.66.244.207")
		.inferHtmlResources()
		.acceptHeader("application/json, text/javascript, */*; q=0.01")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Proxy-Connection" -> "keep-alive")

	val headers_2 = Map(
		"Accept" -> "*/*",
		"Proxy-Connection" -> "keep-alive")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Origin" -> "http://52.66.244.207",
		"Proxy-Connection" -> "keep-alive")

	val headers_7 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "http://52.66.244.207",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_10 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Origin" -> "http://52.66.244.207",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_11 = Map(
		"Content-Type" -> "application/json",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_31 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Proxy-Connection" -> "keep-alive")



	val scn = scenario("DeleteCourse")
		// Home Page
		.exec(http("request_0")
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
			.post("/lib/ajax/service.php?sesskey=ilA28k9L9y&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0007_request.json"))))
		.pause(7)
		// Login Page
		.exec(http("request_8")
			.get("/login/index.php")
			.headers(headers_0)
			.resources(http("request_9")
			.post("/lib/ajax/service.php?sesskey=ilA28k9L9y&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0009_request.json"))))
		.pause(24)
		// Login
		.exec(http("request_10")
			.post("/login/index.php")
			.headers(headers_10)
			.formParam("anchor", "")
			.formParam("logintoken", "z4M3NY92c8rAAcjBaeHPTgUGNTeHDS1f")
			.formParam("username", "mohan")
			.formParam("password", "MOhan@11")
			.resources(http("request_11")
			.get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22ariaeventlistpaginationnavdates%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22block_timeline%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_12")
			.get("/lib/ajax/service-nologin.php?info=core_output_load_fontawesome_icon_map&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_fontawesome_icon_map%22%2C%22args%22%3A%5B%5D%7D%5D")
			.headers(headers_11),
            http("request_13")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_calendar_get_calendar_monthly_view")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0013_request.json")),
            http("request_14")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_course_get_recent_courses")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0014_request.json")),
            http("request_15")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0015_request.json")),
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
			.get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22show%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_21")
			.get("/lib/ajax/service-nologin.php?info=core_get_string,core_get_string,core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22save%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A1%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22loading%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%2C%7B%22index%22%3A2%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringid%22%3A%22closebuttontitle%22%2C%22stringparams%22%3A%5B%5D%2C%22component%22%3A%22%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_22")
			.get("/lib/ajax/service-nologin.php?info=core_get_string&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_get_string%22%2C%22args%22%3A%7B%22stringparams%22%3A%5B%5D%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_23")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_course_get_enrolled_courses_by_timeline_classification")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0023_request.json")),
            http("request_24")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_calendar_get_action_events_by_timesort")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0024_request.json")),
            http("request_25")
			.get("/lib/ajax/service-nologin.php?info=core_output_load_template_with_dependencies&cachekey=1574938282&args=%5B%7B%22index%22%3A0%2C%22methodname%22%3A%22core_output_load_template_with_dependencies%22%2C%22args%22%3A%7B%22component%22%3A%22core_course%22%2C%22template%22%3A%22no-courses%22%2C%22themename%22%3A%22boost%22%2C%22lang%22%3A%22en%22%7D%7D%5D")
			.headers(headers_11),
            http("request_26")
			.get("/theme/image.php/boost/block_myoverview/1574938282/courses")
			.headers(headers_1)))
		.pause(5)
		// Site admin
		.exec(http("request_27")
			.get("/admin/search.php")
			.headers(headers_0)
			.resources(http("request_28")
			.get("/theme/yui_combo.php?m/1574938282/core/formchangechecker/formchangechecker-min.js")
			.headers(headers_2),
            http("request_29")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0029_request.json"))))
		.pause(34)
		// Click Courses
		// Click Manage cources
		.exec(http("request_30")
			.get("/course/management.php")
			.headers(headers_0)
			.resources(http("request_31")
			.get("/theme/yui_combo.php?3.17.2/cssbutton/cssbutton-min.css")
			.headers(headers_31),
            http("request_32")
			.get("/theme/yui_combo.php?m/1574938282/core/widget/widget-focusafterclose-min.js&3.17.2/plugin/plugin-min.js&m/1574938282/core/lockscroll/lockscroll-min.js&m/1574938282/core/notification/notification-dialogue-min.js&m/1574938282/core/notification/notification-exception-min.js&3.17.2/dd-constrain/dd-constrain-min.js&3.17.2/dd-proxy/dd-proxy-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/dd-ddm/dd-ddm-min.js&3.17.2/dd-ddm-drop/dd-ddm-drop-min.js&3.17.2/dd-drop/dd-drop-min.js&3.17.2/dd-drop-plugin/dd-drop-plugin-min.js&3.17.2/dd-delegate/dd-delegate-min.js&m/1574938282/course/management/management-min.js")
			.headers(headers_2),
            http("request_33")
			.get("/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js")
			.headers(headers_2),
            http("request_34")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0034_request.json"))))
		.pause(16)
		// Delete a course
		.exec(http("request_35")
			.get("/course/delete.php?id=160")
			.headers(headers_0)
			.resources(http("request_36")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0036_request.json"))))
		.pause(9)
		// Confirm delete
		.exec(http("request_37")
			.post("/course/delete.php")
			.headers(headers_10)
			.formParam("id", "160")
			.formParam("delete", "62c07b9e779481c611250e7313c4dfae")
			.formParam("sesskey", "IsvEXBDuMh")
			.resources(http("request_38")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0038_request.json"))))
		.pause(10)
		// Click Continue
		.exec(http("request_39")
			.get("/course/management.php?categoryid=1")
			.headers(headers_0)
			.resources(http("request_40")
			.post("/lib/ajax/service.php?sesskey=IsvEXBDuMh&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0040_request.json"))))
		.pause(9)
		// Logout
		.exec(http("request_41")
			.get("/login/logout.php?sesskey=IsvEXBDuMh")
			.headers(headers_0)
			.resources(http("request_42")
			.post("/lib/ajax/service.php?sesskey=41vEJotB8U&info=core_fetch_notifications")
			.headers(headers_7)
			.body(RawFileBody("com/maveric/gatling/deletecourse/0042_request.json"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}