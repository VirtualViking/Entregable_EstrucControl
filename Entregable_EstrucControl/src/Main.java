import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre");
        int codMenuPpal = 0;
        int codMenuTipico = 0;
        int codMenuALaCarta = 0;
        int codMenuInternacional = 0;

        int cantidadFrijoles = 0;
        int cantidadSopaVerduras = 0;
        int cantidadFileteRes = 0;
        int cantidadPolloAsado = 0;
        int cantidadEnsaladaCesar = 0;
        int cantidadSushi = 0;
        int cantidadPizza = 0;
        int cantidadTacos = 0;

        double precioFrijoles = 5.00;
        double precioSopaVerduras = 4.50;
        double precioFileteRes = 10.00;
        double precioPolloAsado = 8.50;
        double precioEnsaladaCesar = 6.00;
        double precioSushi = 12.00;
        double precioPizza = 9.00;
        double precioTacos = 7.00;

        double totalPagar = 0.0;

        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato Típico\n";
            menu += "2. Plato a la Carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Para ver su factura de pedidos al terminar su orden\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    String menuTipico = "MENU TIPICO\n\n";
                    menuTipico += "1. Frijoles ($5.00)\n";
                    menuTipico += "2. Sopa de Verduras ($4.50)\n";
                    menuTipico += "3. Regresar\n";
                    codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                    switch (codMenuTipico) {
                        case 1:
                            cantidadFrijoles++;
                            totalPagar += precioFrijoles;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Frijoles");
                            break;
                        case 2:
                            cantidadSopaVerduras++;
                            totalPagar += precioSopaVerduras;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Sopa de Verduras");
                            break;
                        case 3:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                    break;

                case 2:
                    String menuALaCarta = "MENU A LA CARTA\n\n";
                    menuALaCarta += "1. Filete de Res ($10.00)\n";
                    menuALaCarta += "2. Pollo Asado ($8.50)\n";
                    menuALaCarta += "3. Ensalada César ($6.00)\n";
                    menuALaCarta += "4. Regresar\n";
                    codMenuALaCarta = Integer.parseInt(JOptionPane.showInputDialog(menuALaCarta));

                    switch (codMenuALaCarta) {
                        case 1:
                            cantidadFileteRes++;
                            totalPagar += precioFileteRes;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Filete de Res");
                            break;
                        case 2:
                            cantidadPolloAsado++;
                            totalPagar += precioPolloAsado;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Pollo Asado");
                            break;
                        case 3:
                            cantidadEnsaladaCesar++;
                            totalPagar += precioEnsaladaCesar;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Ensalada César");
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                    break;

                case 3:
                    String menuInternacional = "MENU INTERNACIONAL\n\n";
                    menuInternacional += "1. Sushi ($12.00)\n";
                    menuInternacional += "2. Pizza ($9.00)\n";
                    menuInternacional += "3. Tacos ($7.00)\n";
                    menuInternacional += "4. Regresar\n";
                    codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

                    switch (codMenuInternacional) {
                        case 1:
                            cantidadSushi++;
                            totalPagar += precioSushi;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Sushi");
                            break;
                        case 2:
                            cantidadPizza++;
                            totalPagar += precioPizza;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Pizza");
                            break;
                        case 3:
                            cantidadTacos++;
                            totalPagar += precioTacos;
                            JOptionPane.showMessageDialog(null, "Has seleccionado Tacos");
                            break;
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                    break;

                case 4:
                    String resumen = "Resumen de Pedidos " + nombreUsuario + "\n\n";
                    resumen += "Frijoles: " + cantidadFrijoles + " x $5.00\n";
                    resumen += "Sopa de Verduras: " + cantidadSopaVerduras + " x $4.50\n";
                    resumen += "Filete de Res: " + cantidadFileteRes + " x $10.00\n";
                    resumen += "Pollo Asado: " + cantidadPolloAsado + " x $8.50\n";
                    resumen += "Ensalada César: " + cantidadEnsaladaCesar + " x $6.00\n";
                    resumen += "Sushi: " + cantidadSushi + " x $12.00\n";
                    resumen += "Pizza: " + cantidadPizza + " x $9.00\n";
                    resumen += "Tacos: " + cantidadTacos + " x $7.00\n";
                    resumen += "\nsu factura es de: $ " + totalPagar + " dolares ";
                    JOptionPane.showMessageDialog(null, resumen);
                    JOptionPane.showMessageDialog(null, "Gracias por visitar nuestro restaurante "
                    + nombreUsuario);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (codMenuPpal != 4);
    }
}