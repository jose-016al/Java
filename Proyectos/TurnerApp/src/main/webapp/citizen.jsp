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
                    <div class="container-fluid mt-4">

                        <div class="d-flex align-items-center mb-2">
                            <!-- Sidebar Toggle (Topbar) -->
                            <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                                <i class="fa fa-bars"></i>
                            </button>

                            <!-- Page Heading -->
                            <h1 class="h3 m-0 text-gray-800">Ciudadanos</h1>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">

                            <div class="card-body p-0">
                                <div class="table-responsive">
                                    <table class="table table-hover table">
                                        <thead>
                                            <tr>
                                                <th scope="col">ID</th>
                                                <th scope="col">Nombre</th>
                                                <th scope="col">Apellidos</th>
                                                <th scope="col">Email</th>
                                                <th scope="col">Telefono</th>
                                                <th scope="col">Acciones</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                List<Citizen> citizens = (List<Citizen>) session.getAttribute("citizens");
                                                if (citizens != null && !citizens.isEmpty()) {
                                                    for (Citizen citizen : citizens) {
                                            %>
                                            <tr>
                                                <th><%= citizen.getId()%></th>
                                                <td><%= citizen.getName()%></td>
                                                <td><%= citizen.getSurname()%></td>
                                                <td><%= citizen.getEmail()%></td>
                                                <td><%= citizen.getPhone()%></td>
                                                <td class="d-flex justify-content-around">
                                                    <form action="SvCitizenUpdate" method="GET">
                                                        <input type="hidden" name="citizenId" value="<%=citizen.getId()%>">
                                                        <button type="submit" class="btn btn-success btn-circle btn-sm">
                                                            <i class="fas fa-edit"></i>
                                                        </button>
                                                    </form>
                                                    <form action="SvCitizenDelete" method="POST">
                                                        <input type="hidden" name="citizenId" value="<%=citizen.getId()%>">
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
                                                <td colspan="6" class="text-center">No hay ciudadanos disponibles</td>
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