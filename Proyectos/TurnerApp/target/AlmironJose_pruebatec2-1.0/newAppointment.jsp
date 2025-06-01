<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="com.josealmiron.logica.Citizen"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <%@include file="head.jsp"%>
    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <%@include file="sidebar.jsp"%>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Begin Page Content -->
                    <div class="container-fluid row mx-auto d-flex justify-content-center mt-4">

                        <div class="d-flex align-items-center col-12 mb-2">
                            <!-- Sidebar Toggle (Topbar) -->
                            <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                                <i class="fa fa-bars"></i>
                            </button>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4 col-12 col-md-8 col-lg-6 col-xl-5">

                            <div class="card-body p-0">

                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Nuevo turno</h1>
                                    </div>
                                    <form action="SvAppointment" method="POST" class="user">
                                        <%
                                            String dateNow = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                        %>
                                        <div class="form-group">
                                            <label for="date">Fecha</label>
                                            <input type="date" name="date" min="<%= dateNow %>" class="form-control rounded" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="time">Hora (09:00 - 18:00)</label>
                                            <input type="time" name="time" min="09:00" max="18:00" class="form-control rounded" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="citizen">Ciudadano</label>
                                            <select name="citizen" class="form-control rounded" required>
                                                <option value="" selected>Selecciona un ciudadano</option>
                                                <% List<Citizen> citizens = (List<Citizen>) session.getAttribute("citizens");
                                                    if (citizens != null && !citizens.isEmpty()) {
                                                        for (Citizen citizen : citizens) {
                                                %>
                                                <option value="<%= citizen.getId()%>">
                                                    <%= citizen.getName()%>
                                                    <%= citizen.getSurname()%>
                                                </option>
                                                <% }
                                                } else { %>
                                                <option disabled>No hay ciudadanos disponibles</option>
                                                <% }%>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="time">Descripci&oacute;n</label>
                                            <textarea name="description" class="form-control rounded" rows="4" placeholder="Descripción..."></textarea>
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-user btn-block">
                                            Añadir
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; Jose Almir&oacute;n 2025</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded buttonTop" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="js/demo/chart-area-demo.js"></script>
        <script src="js/demo/chart-pie-demo.js"></script>

    </body>

</html>