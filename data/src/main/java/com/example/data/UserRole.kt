package com.example.data

import android.content.Context
import com.example.core.navigation.MenuItem



enum class UserRole(
    val value: String,
    val menu: List<MenuItem>,
    val bottomNavigationViewNavigation: String,
    private val roleName: Int
) {

    STUDENT(
        value = "6",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_student_fragment_main",
        roleName = R.string.student
    ),

    TEACHER(
        value = "4",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
//            MenuItem.Assessments,
//            MenuItem.Assessments,
//            MenuItem.Courses,
//            MenuItem.Chat,
//            MenuItem.Exams,
//            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_teacher_fragment_main",
        roleName = R.string.teacher
    ),

    GUARDIAN(
        value = "3",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_guardian_fragment_main",
        roleName = R.string.guardian
    ),

    TEACHER_SUPERVISOR(
        value = "11",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_other_roles_fragment_main",
        roleName = R.string.teacher_supervisor
    ),

    ADMIN(
        value = "2",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_admin_fragment_main",
        roleName = R.string.administrator
    ),

    MANAGER(
        value = "8",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_school_manager_fragment_main",
        roleName = R.string.manager
    ),


    FLOOR_SUPERVISOR(
        value = "12",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_other_roles_fragment_main",
        roleName = R.string.floor_supervisor
    ),

    BUS_SUPERVISOR(
        value = "37",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_bus_supervisor_roles_fragment_main",
        roleName = R.string.bus_supervisor
    ),

    DRIVER(
        value = "21",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_driver_roles_fragment_main",
        roleName = R.string.personal_driver
    ),

    UNKNOWN(
        value = "100",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_unknown_fragment_main",
        roleName = R.string.unknown
    ),


    GENERAL(
        value = "29",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_other_roles_fragment_main",
        roleName = R.string.general
    ),

    ADVISER(
        value = "9",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_adviser_fragment_main",
        roleName = R.string.adviser
    ),

    SCHOOL_OWNER(
        value = "30",
        menu = listOf(
            MenuItem.Main,
            MenuItem.Mailbox,
            MenuItem.Assessments,
            MenuItem.Assessments,
            MenuItem.Courses,
            MenuItem.Chat,
            MenuItem.Exams,
            MenuItem.VirtualClassroom
        ),
        bottomNavigationViewNavigation = "navigation_school_owner_fragment_main",
        roleName = R.string.school_owner
    );

}
