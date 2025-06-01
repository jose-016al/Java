<%@page import="com.josealmiron.logica.Citizen"%>
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

                        <c:if test="${not empty error}">
                            <p class="text-danger">${error}</p>
                        </c:if>

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
                                        <h1 class="h4 text-gray-900 mb-4">Editar ciudadano</h1>
                                    </div>
                                    <%
                                        Citizen citizen = (Citizen) session.getAttribute("citizenEdit");
                                    %>
                                    <form action="SvCitizenUpdate" method="POST" class="user">
                                        <div class="form-group">
                                            <label for="name">Nombre</label>
                                            <input type="text" name="name" value="<%= citizen.getName()%>" class="form-control rounded" placeholder="Peter" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="surname">Apellidos</label>
                                            <input type="text" name="surname" value="<%= citizen.getSurname()%>" class="form-control rounded" placeholder="Anthony" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Correo electronico</label>
                                            <input type="email" name="email" value="<%= citizen.getEmail()%>" class="form-control rounded"
                                                   placeholder="peter@anthony.com">
                                        </div>
                                        <div class="form-group">
                                            <label for="phone">Telefono</label>
                                            <input type="text" name="phone" value="<%= citizen.getPhone()%>" class="form-control rounded"
                                                   placeholder="000 00 00 00">
                                        </div>
                                        <button type="submit"class="btn btn-primary btn-user btn-block">
                                            Editar
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