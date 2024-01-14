package com.example.core.navigation

import com.example.data.R

sealed class MenuItem(val route: String, val title: String, val icon: Int ) {
    object Main : MenuItem("main", "Home", R.drawable.ic_home)
    object Trips : MenuItem("trips", "Trips", R.drawable.ic_bus_trips)
    object Assignments : MenuItem("assignments", "Assignments", R.drawable.ic_assignments)
    object CoursesMaterials :
        MenuItem("courses_materials", "Courses Materials", R.drawable.ic_courses)

    object PreviousCoursesContent : MenuItem(
        "previous_courses_content",
        "Previous Courses Content",
        R.drawable.ic_previous_content
    )

    object Exams : MenuItem("exams", "Exams", R.drawable.ic_exam)
    object VideoLecture : MenuItem("video_lecture", "Video Lecture", R.drawable.ic_video_lecture)
    object Mailbox : MenuItem("Mailbox_Screen", "Mailbox", R.drawable.ic_mail)
    object Assessments : MenuItem("assessments", "Assessments", R.drawable.ic_assessment)
    object DiscussionRooms :
        MenuItem("discussion_rooms", "Discussion Rooms", R.drawable.ic_discussion_room)

    object PartnerLibrary :
        MenuItem("partner_library", "Partner Library", R.drawable.ic_digital_library)

    object OfflineVideos :
        MenuItem("offline_videos", "Offline Videos", R.drawable.ic_offline_videos)

    object WeeklyPlanWebView :
        MenuItem("weekly_plan_web_view", "Weekly Plan", R.drawable.ic_weekly_plan)

    object DisciplineBehavior :
        MenuItem("discipline_behavior", "Discipline and Behavior", R.drawable.ic_behaviours)

    object Calendar : MenuItem("calendar", "Calendar", R.drawable.ic_calendar)
    object Schedule : MenuItem("schedule", "Schedule", R.drawable.ic_schedule)
    object ScheduleWebView : MenuItem("schedule_web_view", "Schedule", R.drawable.ic_schedule)
    object Absences : MenuItem("absences", "Absences", R.drawable.ic_absences)
    object VirtualClassroom :
        MenuItem("virtual_classroom", "Virtual Classroom", R.drawable.ic_virtual_classroom)

    object Courses : MenuItem("courses", "Courses", R.drawable.ic_courses)
    object HomeLocation : MenuItem("home_location", "Home Location", R.drawable.ic_home_address)
    object ReportCards : MenuItem("report_cards", "Report Cards", R.drawable.ic_reportcard)
    object MyCard : MenuItem("my_card", "My Card", R.drawable.ic_my_card)
    object Announcements : MenuItem("announcements", "Announcements", R.drawable.ic_announcment)
    object Books : MenuItem("books", "Books", R.drawable.ic_books)
    object Chat : MenuItem("chat", "Chat", R.drawable.ic_chat)
    object EPortfolios : MenuItem("ePortfolios", "E-Portfolios", R.drawable.ic_e_portfolios)
    object ProgramAcademy :
        MenuItem("program_academy", "Program Academy", R.drawable.ic_program_academy)

    object SuccessPartners :
        MenuItem("success_partners", "Success Partners", R.drawable.ic_success_partners)

    object OnlineClaimsInvoices :
        MenuItem("online_claims_invoices", "Online Claims Invoices", R.drawable.ic_financial)

    object ImportantLinks :
        MenuItem("important_links", "Important Links", R.drawable.ic_important_links)

    object EduMall : MenuItem("edu_mall", "Edu Mall", R.drawable.ic_mall)
    object Settings : MenuItem("settings", "Settings", R.drawable.ic_settings)
    object Logout : MenuItem("logout", "Logout", R.drawable.ic_logout)
}
