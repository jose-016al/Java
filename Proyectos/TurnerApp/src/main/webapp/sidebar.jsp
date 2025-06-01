<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="navbar-nav sidebar sidebar-dark accordion" id="accordionSidebar">

    <!-- Sidebar - Brand -->
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="SvIndex">
        <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-calendar-check"></i>
        </div>
        <div class="sidebar-brand-text mx-3">TurnerApp</div>
    </a>

    <!-- Divider -->
    <hr class="sidebar-divider my-0">

    <!-- Nav Item - Dashboard -->
    <li class="nav-item hover">
        <a class="nav-link" href="SvIndex">
            <i class="fas fa-fw fa-home"></i>
            <span>Inicio</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        Ciudadanos
    </div>

    <li class="nav-item hover">
        <a class="nav-link" href="SvCitizen">
            <i class="fas fa-fw fa-user"></i>
            <span>Lista</span></a>
    </li>

    <li class="nav-item hover">
        <a class="nav-link" href="newCitizen.jsp">
            <i class="fas fa-fw fa-user-plus"></i>
            <span>Nuevo</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        Turnos
    </div>

    <li class="nav-item hover">
        <a class="nav-link" href="SvAppointment">
            <i class="fas fa-fw fa-calendar-alt"></i>
            <span>Lista</span></a>
    </li>

    <li class="nav-item hover">
        <a class="nav-link" href="newAppointment.jsp">
            <i class="fas fa-fw fa-calendar-plus"></i>
            <span>Nuevo</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider d-none d-md-block">

    <!-- Sidebar Toggler (Sidebar) -->
    <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
    </div>
</ul>