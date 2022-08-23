import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JogoDaVelha extends JFrame {

    JButton[] button = new JButton[9];
    JButton reiniciaJogo = new JButton("NOVO");
    JButton zerarPlacar = new JButton("ZERAR");

    JLabel placar = new JLabel("Placar");
    JLabel px = new JLabel("X: 0");
    JLabel po = new JLabel("O: 0");

    int PX = 0;
    int PO = 0;

    boolean XO = false;
    boolean[] campoValido = new boolean[9];

    public JogoDaVelha() {
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(350, 150, 700, 500);

        add(placar);
        add(px);
        add(po);
        add(reiniciaJogo);
        add(zerarPlacar);

        placar.setBounds(500, 50, 100, 30);
        px.setBounds(485, 75, 100, 30);
        po.setBounds(530, 75, 100, 30);
        reiniciaJogo.setBounds(530, 120, 110, 30);
        zerarPlacar.setBounds(400, 120, 110, 30);

        reiniciaJogo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                limpar();
            }
        });

        zerarPlacar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PO = 0;
                PX = 0;
                atualizarPlacar();
            }
        });

        int cont = 0;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                button[cont] = new JButton();
                add(button[cont]);
                button[cont].setBounds((100 * l) + 75, (100 * c) + 75, 95, 95);
                button[cont].setFont(new Font("Arial", Font.BOLD, 40));
                cont++;
            }
        }

        for (int i = 0; i < 9; i++) {
            campoValido[i] = false;
        }

        button[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[0] == false) {
                    campoValido[0] = true;
                    mudarJogada(button[0]);
                }
            }
        });

        button[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[1] == false) {
                    campoValido[1] = true;
                    mudarJogada(button[1]);
                }
            }
        });

        button[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[2] == false) {
                    campoValido[2] = true;
                    mudarJogada(button[2]);
                }
            }
        });

        button[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[3] == false) {
                    campoValido[3] = true;
                    mudarJogada(button[3]);
                }
            }
        });

        button[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[4] == false) {
                    campoValido[4] = true;
                    mudarJogada(button[4]);
                }
            }
        });

        button[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[5] == false) {
                    campoValido[5] = true;
                    mudarJogada(button[5]);
                }
            }
        });

        button[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[6] == false) {
                    campoValido[6] = true;
                    mudarJogada(button[6]);
                }
            }
        });

        button[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[7] == false) {
                    campoValido[7] = true;
                    mudarJogada(button[7]);
                }
            }
        });

        button[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campoValido[8] == false) {
                    campoValido[8] = true;
                    mudarJogada(button[8]);
                }
            }
        });
    }

    public void mudarJogada(JButton btn) {
        if (XO) {
            btn.setText("O");
            XO = false;
        } else {
            btn.setText("X");
            XO = true;
        }

        verificaGanhador();
    }

    public void atualizarPlacar() {
        px.setText("X: " + PX);
        po.setText("O: " + PO);
    }

    public void verificaGanhador() {

        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (campoValido[i] == true) {
                cont++;
            }
        }

        if ((button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X")
                || (button[3].getText() == "X" && button[4].getText() == "X" && button[5].getText() == "X")
                || (button[6].getText() == "X" && button[7].getText() == "X" && button[8].getText() == "X")
                || (button[0].getText() == "X" && button[3].getText() == "X" && button[6].getText() == "X")
                || (button[1].getText() == "X" && button[4].getText() == "X" && button[7].getText() == "X")
                || (button[2].getText() == "X" && button[5].getText() == "X" && button[8].getText() == "X")
                || (button[0].getText() == "X" && button[4].getText() == "X" && button[8].getText() == "X")
                || (button[6].getText() == "X" && button[4].getText() == "X" && button[2].getText() == "X")) {
            JOptionPane.showMessageDialog(null, "X GANHOU!");
            PX++;
            atualizarPlacar();
            limpar();

        } else if ((button[0].getText() == "O" && button[1].getText() == "O" && button[2].getText() == "O")
                || (button[3].getText() == "O" && button[4].getText() == "O" && button[5].getText() == "O")
                || (button[6].getText() == "O" && button[7].getText() == "O" && button[8].getText() == "O")
                || (button[0].getText() == "O" && button[3].getText() == "O" && button[6].getText() == "O")
                || (button[1].getText() == "O" && button[4].getText() == "O" && button[7].getText() == "O")
                || (button[2].getText() == "O" && button[5].getText() == "O" && button[8].getText() == "O")
                || (button[0].getText() == "O" && button[4].getText() == "O" && button[8].getText() == "O")
                || (button[6].getText() == "O" && button[4].getText() == "O" && button[2].getText() == "O")) {
            JOptionPane.showMessageDialog(null, "O GANHOU!");
            PO++;
            atualizarPlacar();
            limpar();

        } else if (cont == 9) {
            JOptionPane.showMessageDialog(null, "EMPATE!");
            limpar();
        }
    }

    public void limpar() {
        for (int i = 0; i < 9; i++) {
            button[i].setText("");
            campoValido[i] = false;
            XO = false;
        }
    }

    public static void main(String[] args) {
        new JogoDaVelha();
    }
}