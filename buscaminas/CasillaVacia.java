/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Azucena
 */
public class CasillaVacia extends Casilla {

    private int minasAlrededor;

    public CasillaVacia(int coorX, int coorY, JuegoFrame ventana) {
        super(coorX, coorY, ventana);
        this.setFocusPainted(false);
    }

    public int calcularMinasAlrededor() {
        int minas = 0;
        int i = this.coorX;
        int j = this.coorY;

        if (i == 0) {
            if (j == 0) {
                if (JuegoFrame.casillas[i][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i + 1][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i + 1][j] instanceof CasillaMinada) {
                    minas++;
                }
                return minas;
            } else if (j == (DificultadFrame.columnas - 1)) {
                if (JuegoFrame.casillas[i][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i + 1][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i + 1][j] instanceof CasillaMinada) {
                    minas++;
                }
                return minas;
            } else {
                if (JuegoFrame.casillas[i][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i + 1][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i + 1][j] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i + 1][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                return minas;
            }
        } else if (i == (DificultadFrame.filas - 1)) {
            if (j == 0) {
                if (JuegoFrame.casillas[i - 1][j] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i - 1][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                return minas;
            } else if (j == (DificultadFrame.columnas - 1)) {
                if (JuegoFrame.casillas[i - 1][j] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i - 1][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                return minas;
            } else {
                if (JuegoFrame.casillas[i][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i - 1][j - 1] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i - 1][j] instanceof CasillaMinada) {
                    minas++;
                }
                if (JuegoFrame.casillas[i - 1][j + 1] instanceof CasillaMinada) {
                    minas++;
                }
                return minas;
            }
        } else if (j == 0 && i != 0 && i != (DificultadFrame.filas - 1)) {
            if (JuegoFrame.casillas[i + 1][j] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i - 1][j] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i + 1][j + 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i - 1][j + 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i][j + 1] instanceof CasillaMinada) {
                minas++;
            }
            return minas;
        } else if (j == (DificultadFrame.columnas - 1) && i != 0 && i != (DificultadFrame.filas - 1)) {
            if (JuegoFrame.casillas[i + 1][j] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i - 1][j] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i + 1][j - 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i - 1][j - 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i][j - 1] instanceof CasillaMinada) {
                minas++;
            }
            return minas;
        } else {
            if (JuegoFrame.casillas[i - 1][j - 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i - 1][j] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i - 1][j + 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i][j - 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i][j + 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i + 1][j - 1] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i + 1][j] instanceof CasillaMinada) {
                minas++;
            }
            if (JuegoFrame.casillas[i + 1][j + 1] instanceof CasillaMinada) {
                minas++;
            }
            return minas;
        }
    }

    public void setMinasAlrededor(int minasAlrededor) {
        this.minasAlrededor = minasAlrededor;
    }

    @Override
    public void destapar() {

        if (this.estado != 0) {
            return;
        }
        this.setBackground(new Color(240, 240, 240));
        this.estado = 1;

        switch (this.minasAlrededor) {
            case 1:
                this.setText("1");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0, 0, 225));
                break;
            case 2:
                this.setText("2");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0, 128, 0));
                break;
            case 3:
                this.setText("3");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(255, 0, 0));
                break;
            case 4:
                this.setText("4");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0, 0, 128));
                break;
            case 5:
                this.setText("5");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(128, 0, 0));
                break;
            case 6:
                this.setText("6");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(new Color(0, 128, 128));
                break;
            case 7:
                this.setText("7");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(Color.black);
                break;
            case 8:
                this.setText("8");
                this.setFont(new Font("Calibri Light", 1, 14));
                this.setForeground(Color.lightGray);
                break;

            case 0:
                int i = this.coorX;
                int j = this.coorY;

                if (i == 0) {
                    if (j == 0) {
                        JuegoFrame.casillas[i][j + 1].destapar();
                        JuegoFrame.casillas[i + 1][j + 1].destapar();
                        JuegoFrame.casillas[i + 1][j].destapar();
                    } else if (j == (DificultadFrame.columnas - 1)) {
                        JuegoFrame.casillas[i][j - 1].destapar();
                        JuegoFrame.casillas[i + 1][j - 1].destapar();
                        JuegoFrame.casillas[i + 1][j].destapar();
                    } else {
                        JuegoFrame.casillas[i][j - 1].destapar();
                        JuegoFrame.casillas[i][j + 1].destapar();
                        JuegoFrame.casillas[i + 1][j - 1].destapar();
                        JuegoFrame.casillas[i + 1][j].destapar();
                        JuegoFrame.casillas[i + 1][j + 1].destapar();
                    }
                } else if (i == (DificultadFrame.filas - 1)) {
                    if (j == 0) {
                        JuegoFrame.casillas[i - 1][j].destapar();
                        JuegoFrame.casillas[i - 1][j + 1].destapar();
                        JuegoFrame.casillas[i][j + 1].destapar();
                    } else if (j == (DificultadFrame.columnas - 1)) {
                        JuegoFrame.casillas[i - 1][j].destapar();
                        JuegoFrame.casillas[i - 1][j - 1].destapar();
                        JuegoFrame.casillas[i][j - 1].destapar();
                    } else {
                        JuegoFrame.casillas[i][j - 1].destapar();
                        JuegoFrame.casillas[i][j + 1].destapar();
                        JuegoFrame.casillas[i - 1][j - 1].destapar();
                        JuegoFrame.casillas[i - 1][j].destapar();
                        JuegoFrame.casillas[i - 1][j + 1].destapar();
                    }
                } else if (j == 0 && i != 0 && i != (DificultadFrame.filas - 1)) {
                    JuegoFrame.casillas[i + 1][j].destapar();
                    JuegoFrame.casillas[i - 1][j].destapar();
                    JuegoFrame.casillas[i + 1][j + 1].destapar();
                    JuegoFrame.casillas[i - 1][j + 1].destapar();
                    JuegoFrame.casillas[i][j + 1].destapar();
                } else if (j == (DificultadFrame.columnas - 1) && i != 0
                        && i != (DificultadFrame.filas - 1)) {
                    JuegoFrame.casillas[i + 1][j].destapar();
                    JuegoFrame.casillas[i - 1][j].destapar();
                    JuegoFrame.casillas[i + 1][j - 1].destapar();
                    JuegoFrame.casillas[i - 1][j - 1].destapar();
                    JuegoFrame.casillas[i][j - 1].destapar();
                } else {
                    JuegoFrame.casillas[i - 1][j - 1].destapar();
                    JuegoFrame.casillas[i - 1][j].destapar();
                    JuegoFrame.casillas[i - 1][j + 1].destapar();
                    JuegoFrame.casillas[i][j - 1].destapar();
                    JuegoFrame.casillas[i][j + 1].destapar();
                    JuegoFrame.casillas[i + 1][j - 1].destapar();
                    JuegoFrame.casillas[i + 1][j].destapar();
                    JuegoFrame.casillas[i + 1][j + 1].destapar();
                }
                break;
            default:
                break;
        }
        ventana.destapadas++;

        if (ventana.destapadas == (((DificultadFrame.filas) * (DificultadFrame.columnas)) - (DificultadFrame.minas))) {
            this.ventana.flagearMinadas();
            ventana.destapadas = 0;
            this.ganar();
        }
    }

    private void ganar() {
        ventana.reiniciarDestapadas();
        int respuesta = JOptionPane.showConfirmDialog(null, "           ¡Ganaste! :) \nDesea jugar una nueva partida?", "¿Qué desea hacer?", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (respuesta == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {
            this.ventana.perder();
            DificultadFrame f = new DificultadFrame();
            f.setVisible(true);
        }
    }

}
