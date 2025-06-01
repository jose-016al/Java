<%@page import="com.josealmiron.logica.Appointment"%>
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
                    <div class="container-fluid mt-4">

                        <div class="d-flex align-items-center justify-content-between row mb-2">
                            <div class="d-flex align-items-center col-12 col-md-1">
                                <!-- Sidebar Toggle (Topbar) -->
                                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                                    <i class="fa fa-bars"></i>
                                </button>

                                <!-- Page Heading -->
                                <h1 class="h3 m-0 text-gray-800">Turnos</h1>
                            </div>

                            <form action="SvAppointment" method="GET" class="d-flex justify-content-end align row col-12 col-md-10 col-lg-6">
                                <!-- Filter Appointments -->
                                <div class="p-2 col-12 col-md-4 col-lg-4">
                                    <input type="date" name="date" class="form-control rounded" required>
                                </div>
                                <div class="p-2 col-12 col-md-4 col-lg-4">
                                    <select name="status" class="form-control" <option value="" selected>No enviar nada</option>
                                        <option value="" selected>No enviar nada</option>
                                        <option value="En espera">En espera</option>
                                        <option value="Ya atendido">Ya atendido</option>
                                    </select>
                                </div>
                                <div class="p-2 col-12 col-md-4 col-lg-3">
                                    <button type="submit" class="btn btn-primary btn-user btn-block">
                                        Filtrar
                                    </button>
                                </div>
                            </form>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">

                            <div class="card-body p-0">
                                <div class="table-responsive">
                                    <table class="table table-hover table">
                                        <thead>
                                            <tr>
                                                <th scope="col">ID</th>
                                                <th scope="col">Fecha</th>
                                                <th scope="col">Hora</th>
                                                <th scope="col">Descripci&oacute;n</th>
                                                <th scope="col">Estado</th>
                                                <th scope="col">Ciudadano</th>
                                                <th scope="col">Acciones</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                List<Appointment> appointments = (List<Appointment>) session.getAttribute("appointments");
                                                if (appointments != null && !appointments.isEmpty()) {
                                                    for (Appointment appointment : appointments) {
                                            %>
                                            <tr>
                                                <th><%= appointment.getId()%></th>
                                                <td><%= appointment.getAssignedDateFormatted()[0]%></td>
                                                <td><%= appointment.getAssignedDateFormatted()[1]%></td>
                                                <td><%= appointment.getDescription()%></td>
                                                <td><%= appointment.getStatus()%></td>
                                                <td><%= appointment.getCitizen()%></td>
                                                <td class="d-flex justify-content-around">
                                                    <form action="SvAppointmentUpdate" method="GET">
                                                        <input type="hidden" name="appointmentId" value="<%=appointment.getId()%>">
                                                        <button type="submit" class="btn btn-success btn-circle btn-sm">
                                                            <i class="fas fa-edit"></i>
                                                        </button>
                                                    </form>
                                                    <form action="SvAppointmentDelete" method="POST">
                                                        <input type="hidden" name="appointmentId" value="<%=appointment.getId()%>">
                                                        <button type="submit" class="btn btn-danger btn-circle btn-sm">
                                                            <i class="fas fa-trash"></i>
                                                        </button>
                                                    </form>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            } else {
                                            %>
                                            <tr>
                                                <td colspan="7" class="text-center">No hay turnos disponibles</td>
                                            </tr>
                                            <%
                                                }
                                            %>
                                        </tbody>
                                    </table>
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