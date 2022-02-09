
public class FlipGUI extends javax.swing.JFrame {
               
    private static javax.swing.JButton a1Button;
    private ButtonHandler a1;
    private javax.swing.JButton a2Button;
    private ButtonHandler a2;
    private javax.swing.JButton a3Button;
    private ButtonHandler a3;
    private javax.swing.JButton a4Button;
    private ButtonHandler a4;
    private javax.swing.JButton a5Button;
    private ButtonHandler a5;
    private javax.swing.JButton b1Button;
    private ButtonHandler b1;
    private javax.swing.JButton b2Button;
    private ButtonHandler b2;
    private javax.swing.JButton b3Button;
    private ButtonHandler b3;
    private javax.swing.JButton b4Button;
    private ButtonHandler b4;
    private javax.swing.JButton b5Button;
    private ButtonHandler b5;
    private javax.swing.JButton c1Button;
    private ButtonHandler c1;
    private javax.swing.JButton c2Button;
    private ButtonHandler c2;
    private javax.swing.JButton c3Button;
    private ButtonHandler c3;
    private javax.swing.JButton c4Button;
    private ButtonHandler c4;
    private javax.swing.JButton c5Button;
    private ButtonHandler c5;
    private javax.swing.JButton d1Button;
    private ButtonHandler d1;
    private javax.swing.JButton d2Button;
    private ButtonHandler d2;
    private javax.swing.JButton d3Button;
    private ButtonHandler d3;
    private javax.swing.JButton d4Button;
    private ButtonHandler d4;
    private javax.swing.JButton d5Button;
    private ButtonHandler d5;
    private javax.swing.JButton e1Button;
    private ButtonHandler e1;
    private javax.swing.JButton e2Button;
    private ButtonHandler e2;
    private javax.swing.JButton e3Button;
    private ButtonHandler e3;
    private javax.swing.JButton e4Button;
    private ButtonHandler e4;
    private javax.swing.JButton e5Button;
    private ButtonHandler e5;
    
    
    private static javax.swing.JButton markButton;
    private boolean markMode;
    
    
    private static javax.swing.JLabel currentPointCounter;
    
    
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelE;
    
    
    private javax.swing.JLabel pointNameLabel;
    private static javax.swing.JLabel totalPointCounter;
    private javax.swing.JLabel totalPointNameLabel;

    private static boolean gameFinished;
    
    private static int totalPoints;
    
    private static VoltorbLogic log;
	
    public FlipGUI() {
        
        pointNameLabel = new javax.swing.JLabel();
        currentPointCounter = new javax.swing.JLabel();
        currentPointCounter.setText("0");
        
        totalPointNameLabel = new javax.swing.JLabel();
        totalPoints = 0;
        totalPointCounter = new javax.swing.JLabel();
        totalPointCounter.setText("" + totalPoints);
        
    	
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
    	
    	log = new VoltorbLogic();
    	
    	gameFinished = false;
    	
    	markButton = new javax.swing.JButton();
    	
        a1Button = new javax.swing.JButton();
        a1 = new ButtonHandler(log.getSquareVal(0, 0), 0, 0);
        b1Button = new javax.swing.JButton();
        b1 = new ButtonHandler(log.getSquareVal(0, 1), 0, 1);
        c1Button = new javax.swing.JButton();
        c1 = new ButtonHandler(log.getSquareVal(0, 2), 0, 2);
        d1Button = new javax.swing.JButton();
        d1 = new ButtonHandler(log.getSquareVal(0, 3), 0, 3);
        e1Button = new javax.swing.JButton();
        e1 = new ButtonHandler(log.getSquareVal(0, 4), 0, 4);
        
        a2Button = new javax.swing.JButton();
        a2 = new ButtonHandler(log.getSquareVal(1, 0), 1, 0);
        b2Button = new javax.swing.JButton();
        b2 = new ButtonHandler(log.getSquareVal(1, 1), 1, 1);
        c2Button = new javax.swing.JButton();
        c2 = new ButtonHandler(log.getSquareVal(1, 2), 1, 2);
        d2Button = new javax.swing.JButton();
        d2 = new ButtonHandler(log.getSquareVal(1, 3), 1, 3);
        e2Button = new javax.swing.JButton();
        e2 = new ButtonHandler(log.getSquareVal(1, 4), 1, 4);
        
        a3Button = new javax.swing.JButton();
        a3 = new ButtonHandler(log.getSquareVal(2, 0), 2, 0);
        b3Button = new javax.swing.JButton();
        b3 = new ButtonHandler(log.getSquareVal(2, 1), 2, 1);
        c3Button = new javax.swing.JButton();
        c3 = new ButtonHandler(log.getSquareVal(2, 2), 2, 2);
        d3Button = new javax.swing.JButton();
        d3 = new ButtonHandler(log.getSquareVal(2, 3), 2, 3);
        e3Button = new javax.swing.JButton();
        e3 = new ButtonHandler(log.getSquareVal(2, 4), 2, 4);
        
        a4Button = new javax.swing.JButton();
        a4 = new ButtonHandler(log.getSquareVal(3, 0), 3, 0);
        b4Button = new javax.swing.JButton();
        b4 = new ButtonHandler(log.getSquareVal(3, 1), 3, 1);
        c4Button = new javax.swing.JButton();
        c4 = new ButtonHandler(log.getSquareVal(3, 2), 3, 2);
        d4Button = new javax.swing.JButton();
        d4 = new ButtonHandler(log.getSquareVal(3, 3), 3, 3);
        e4Button = new javax.swing.JButton();
        e4 = new ButtonHandler(log.getSquareVal(3, 4), 3, 4);
        
        a5Button = new javax.swing.JButton();
        a5 = new ButtonHandler(log.getSquareVal(4, 0), 4, 0);
        b5Button = new javax.swing.JButton();
        b5 = new ButtonHandler(log.getSquareVal(4, 1), 4, 1);
        c5Button = new javax.swing.JButton();
        c5 = new ButtonHandler(log.getSquareVal(4, 2), 4, 2);
        d5Button = new javax.swing.JButton();
        d5 = new ButtonHandler(log.getSquareVal(4, 3), 4, 3);
        e5Button = new javax.swing.JButton();
        e5 = new ButtonHandler(log.getSquareVal(4, 4), 4, 4);
        
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        labelC = new javax.swing.JLabel();
        labelD = new javax.swing.JLabel();
        labelE = new javax.swing.JLabel();
        
        markMode = false;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a1Button.setText("");
        a1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ButtonActionPerformed(evt);
            }
        });

        b1Button.setText("");
        b1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ButtonActionPerformed(evt);
            }
        });

        c1Button.setText("");
        c1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ButtonActionPerformed(evt);
            }
        });

        d1Button.setText("");
        d1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ButtonActionPerformed(evt);
            }
        });

        e1Button.setText("");
        e1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ButtonActionPerformed(evt);
            }
        });

        a2Button.setText("");
        a2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ButtonActionPerformed(evt);
            }
        });

        b2Button.setText("");
        b2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ButtonActionPerformed(evt);
            }
        });

        c2Button.setText("");
        c2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ButtonActionPerformed(evt);
            }
        });

        d2Button.setText("");
        d2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ButtonActionPerformed(evt);
            }
        });

        e2Button.setText("");
        e2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ButtonActionPerformed(evt);
            }
        });

        

        a3Button.setText("");
        a3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ButtonActionPerformed(evt);
            }
        });

        b3Button.setText("");
        b3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ButtonActionPerformed(evt);
            }
        });

        c3Button.setText("");
        c3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ButtonActionPerformed(evt);
            }
        });

        d3Button.setText("");
        d3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ButtonActionPerformed(evt);
            }
        });

        e3Button.setText("");
        e3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ButtonActionPerformed(evt);
            }
        });

        
        a4Button.setText("");
        a4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ButtonActionPerformed(evt);
            }
        });
        
        b4Button.setText("");
        b4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ButtonActionPerformed(evt);
            }
        });

        c4Button.setText("");
        c4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ButtonActionPerformed(evt);
            }
        });

        d4Button.setText("");
        d4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ButtonActionPerformed(evt);
            }
        });
        
        e4Button.setText("");
        e4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ButtonActionPerformed(evt);
            }
        });
        

        

        a5Button.setText("");
        a5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ButtonActionPerformed(evt);
            }
        });

        b5Button.setText("");
        b5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ButtonActionPerformed(evt);
            }
        });

        c5Button.setText("");
        c5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ButtonActionPerformed(evt);
            }
        });

        d5Button.setText("");
        d5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ButtonActionPerformed(evt);
            }
        });
        
		e5Button.setText("");
		e5Button.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		         e5ButtonActionPerformed(evt);
		    }
		});
		        
        label1.setText(log.getRowVals(0));

        label2.setText(log.getRowVals(1));

        label3.setText(log.getRowVals(2));

        label4.setText(log.getRowVals(3));

        label5.setText(log.getRowVals(4));

        labelA.setText(log.getColVals(0));

        labelB.setText(log.getColVals(1));

        labelC.setText(log.getColVals(2));

        labelD.setText(log.getColVals(3));

        labelE.setText(log.getColVals(4));

        pointNameLabel.setText("POINTS:");

        totalPointNameLabel.setText("TOTAL POINTS:");


        markButton.setText("");
        markButton.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		         markButtonActionPerformed(evt);
		    }
		});


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(markButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(a4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(a1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalPointNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(totalPointCounter)
                                .addGap(96, 96, 96)
                                .addComponent(pointNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentPointCounter)))
                        .addGap(44, 44, 44)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pointNameLabel)
                        .addComponent(currentPointCounter))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalPointNameLabel)
                        .addComponent(totalPointCounter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        
    }                       

    public static void updateCurrentPoints() {
    	currentPointCounter.setText("" + log.getCurrentPoints());
    }
    
    
    private void a1ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !a1.getClicked() && !gameFinished) {
    		if (a1Button.getText().equals("")) {
    			a1Button.setText("X");
    		} else {
    			a1Button.setText("");
    		}
    	} else if (!a1.getClicked() && !gameFinished) {
    		a1Button.setText("" + log.getSquareVal(0, 0));
    		a1.setClicked();
    	}
    	
    }    
    
    private void b1ButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	if (markMode && !b1.getClicked() && !gameFinished) {
    		if (b1Button.getText().equals("")) {
    			b1Button.setText("X");
    		} else {
    			b1Button.setText("");
    		}
    	} else if (!b1.getClicked() && !gameFinished) {
    		b1Button.setText("" + log.getSquareVal(0, 1));
    		b1.setClicked();
    	}
        
    }
    
    private void c1ButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    	if (markMode && !c1.getClicked() && !gameFinished) {
    		if (c1Button.getText().equals("")) {
    			c1Button.setText("X");
    		} else {
    			c1Button.setText("");
    		}
    	} else if (!c1.getClicked() && !gameFinished) {
    		c1Button.setText("" + log.getSquareVal(0, 2));
    		c1.setClicked();
    	}
        
    }
    
    private void d1ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !d1.getClicked() && !gameFinished) {
    		if (d1Button.getText().equals("")) {
    			d1Button.setText("X");
    		} else {
    			d1Button.setText("");
    		}
    	} else if (!d1.getClicked() && !gameFinished) {
    		d1Button.setText("" + log.getSquareVal(0, 3));
    		d1.setClicked();
    	}
        
    }
    
    private void e1ButtonActionPerformed(java.awt.event.ActionEvent evt) {       
    	
    	if (markMode && !e1.getClicked() && !gameFinished) {
    		if (e1Button.getText().equals("")) {
    			e1Button.setText("X");
    		} else {
    			e1Button.setText("");
    		}
    	} else if (!e1.getClicked() && !gameFinished) {
    		e1Button.setText("" + log.getSquareVal(0, 4));
    		e1.setClicked();
    	}
        
    }

    
    private void a2ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !a2.getClicked() && !gameFinished) {
    		if (a2Button.getText().equals("")) {
    			a2Button.setText("X");
    		} else {
    			a2Button.setText("");
    		}
    	} else if (!a2.getClicked() && !gameFinished) {
    		a2Button.setText("" + log.getSquareVal(1, 0));
    		a2.setClicked();
    	}
        
    }
    
    private void b2ButtonActionPerformed(java.awt.event.ActionEvent evt) {    
    	
    	if (markMode && !b2.getClicked() && !gameFinished) {
    		if (b2Button.getText().equals("")) {
    			b2Button.setText("X");
    		} else {
    			b2Button.setText("");
    		}
    	} else if (!b2.getClicked() && !gameFinished) {
    		b2Button.setText("" + log.getSquareVal(1, 1));
    		b2.setClicked();
    	}
        
    }
    
    private void c2ButtonActionPerformed(java.awt.event.ActionEvent evt) {      
    	
    	if (markMode && !c2.getClicked() && !gameFinished) {
    		if (c2Button.getText().equals("")) {
    			c2Button.setText("X");
    		} else {
    			c2Button.setText("");
    		}
    	} else if (!c2.getClicked() && !gameFinished) {
    		c2Button.setText("" + log.getSquareVal(1, 2));
    		c2.setClicked();
    	}
        
    }
    
    private void d2ButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	if (markMode && !d2.getClicked() && !gameFinished) {
    		if (d2Button.getText().equals("")) {
    			d2Button.setText("X");
    		} else {
    			d2Button.setText("");
    		}
    	} else if (!d2.getClicked() && !gameFinished) {
    		d2Button.setText("" + log.getSquareVal(1, 3));
    		d2.setClicked();
    	}
        
    }
    
    private void e2ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !e2.getClicked() && !gameFinished) {
    		if (e2Button.getText().equals("")) {
    			e2Button.setText("X");
    		} else {
    			e2Button.setText("");
    		}
    	} else if (!e2.getClicked() && !gameFinished) {
    		e2Button.setText("" + log.getSquareVal(1, 4));
    		e2.setClicked();
    	}
        
    }
    
    
    private void a3ButtonActionPerformed(java.awt.event.ActionEvent evt) {       
    	
    	if (markMode && !a3.getClicked() && !gameFinished) {
    		if (a3Button.getText().equals("")) {
    			a3Button.setText("X");
    		} else {
    			a3Button.setText("");
    		}
    	} else if (!a3.getClicked() && !gameFinished) {
    		a3Button.setText("" + log.getSquareVal(2, 0));
    		a3.setClicked();
    	}
        
    }
    
    private void b3ButtonActionPerformed(java.awt.event.ActionEvent evt) {      
    	
    	if (markMode && !b3.getClicked() && !gameFinished) {
    		if (b3Button.getText().equals("")) {
    			b3Button.setText("X");
    		} else {
    			b3Button.setText("");
    		}
    	} else if (!b3.getClicked() && !gameFinished) {
    		b3Button.setText("" + log.getSquareVal(2, 1));
    		b3.setClicked();
    	}
        
    }
    
    private void c3ButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	if (markMode && !c3.getClicked() && !gameFinished) {
    		if (c3Button.getText().equals("")) {
    			c3Button.setText("X");
    		} else {
    			c3Button.setText("");
    		}
    	} else if (!c3.getClicked() && !gameFinished) {
    		c3Button.setText("" + log.getSquareVal(2, 2));
    		c3.setClicked();
    	}
        
    }
    
    private void d3ButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    	if (markMode && !d3.getClicked() && !gameFinished) {
    		if (d3Button.getText().equals("")) {
    			d3Button.setText("X");
    		} else {
    			d3Button.setText("");
    		}
    	} else if (!d3.getClicked() && !gameFinished) {
    		d3Button.setText("" + log.getSquareVal(2, 3));
    		d3.setClicked();
    	}
        
    }
    
    private void e3ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !e3.getClicked() && !gameFinished) {
    		if (e3Button.getText().equals("")) {
    			e3Button.setText("X");
    		} else {
    			e3Button.setText("");
    		}
    	} else if (!e3.getClicked() && !gameFinished) {
    		e3Button.setText("" + log.getSquareVal(2, 4));
    		e3.setClicked();
    	}
        
    }

    
    
    private void a4ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !a4.getClicked() && !gameFinished) {
    		if (a4Button.getText().equals("")) {
    			a4Button.setText("X");
    		} else {
    			a4Button.setText("");
    		}
    	} else if (!a4.getClicked() && !gameFinished) {
    		a4Button.setText("" + log.getSquareVal(3, 0));
    		a4.setClicked();
    	}
        
    }
    
    private void b4ButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    	if (markMode && !b4.getClicked() && !gameFinished) {
    		if (b4Button.getText().equals("")) {
    			b4Button.setText("X");
    		} else {
    			b4Button.setText("");
    		}
    	} else if (!b4.getClicked() && !gameFinished) {
    		b4Button.setText("" + log.getSquareVal(3, 1));
    		b4.setClicked();
    	}
        
    }
    
    private void c4ButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	if (markMode && !c4.getClicked() && !gameFinished) {
    		if (c4Button.getText().equals("")) {
    			c4Button.setText("X");
    		} else {
    			c4Button.setText("");
    		}
    	} else if (!c4.getClicked() && !gameFinished) {
    		c4Button.setText("" + log.getSquareVal(3, 2));
    		c4.setClicked();
    	}
        
    }
    
    private void d4ButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	if (markMode && !d4.getClicked() && !gameFinished) {
    		if (d4Button.getText().equals("")) {
    			d4Button.setText("X");
    		} else {
    			d4Button.setText("");
    		}
    	} else if (!d4.getClicked() && !gameFinished) {
    		d4Button.setText("" + log.getSquareVal(3, 3));
    		d4.setClicked();
    	}
        
    }
    
    private void e4ButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	if (markMode && !e4.getClicked() && !gameFinished) {
    		if (e4Button.getText().equals("")) {
    			e4Button.setText("X");
    		} else {
    			e4Button.setText("");
    		}
    	} else if (!e4.getClicked() && !gameFinished) {
    		e4Button.setText("" + log.getSquareVal(3, 4));
    		e4.setClicked();
    	}
        
    }
    
    
    
    private void a5ButtonActionPerformed(java.awt.event.ActionEvent evt) {    
    	
    	if (markMode && !a5.getClicked() && !gameFinished) {
    		if (a5Button.getText().equals("")) {
    			a5Button.setText("X");
    		} else {
    			a5Button.setText("");
    		}
    	} else if (!a5.getClicked() && !gameFinished) {
    		a5Button.setText("" + log.getSquareVal(4, 0));
    		a5.setClicked();
    	}
        
    }
    
    private void b5ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !b5.getClicked() && !gameFinished) {
    		if (b5Button.getText().equals("")) {
    			b5Button.setText("X");
    		} else {
    			b5Button.setText("");
    		}
    	} else if (!b5.getClicked() && !gameFinished) {
    		b5Button.setText("" + log.getSquareVal(4, 1));
    		b5.setClicked();
    	}
        
    }
    
    private void c5ButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	if (markMode && !c5.getClicked() && !gameFinished) {
    		if (c5Button.getText().equals("")) {
    			c5Button.setText("X");
    		} else {
    			c5Button.setText("");
    		}
    	} else if (!c5.getClicked() && !gameFinished) {
    		c5Button.setText("" + log.getSquareVal(4, 2));
    		c5.setClicked();
    	}
        
    }
    
    private void d5ButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    	if (markMode && !d5.getClicked() && !gameFinished) {
    		if (d5Button.getText().equals("")) {
    			d5Button.setText("X");
    		} else {
    			d5Button.setText("");
    		}
    	} else if (!d5.getClicked() && !gameFinished) {
    		d5Button.setText("" + log.getSquareVal(4, 3));
    		d5.setClicked();
    	}
        
    }
    
    private void e5ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if (markMode && !e5.getClicked() && !gameFinished) {
    		if (e5Button.getText().equals("")) {
    			e5Button.setText("X");
    		} else {
    			e5Button.setText("");
    		}
    	} else if (!e5.getClicked() && !gameFinished) {
    		e5Button.setText("" + log.getSquareVal(4, 4));
    		e5.setClicked();
    	}
        
    }
    
    private void markButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	if (markButton.getText().equals(">")) {
    		eraseBoard();
    		initComponents();
    		
    	} else {
    		markMode = !markMode;
    		if (markMode && markButton.getText().equals("")) {
    			markButton.setText("X");
    		} else {
    			markButton.setText("");
    		}
    	}
    }
    
    private void eraseBoard() {
    	a1Button.setVisible(false);
    	b1Button.setVisible(false);
    	c1Button.setVisible(false);
    	d1Button.setVisible(false);
    	e1Button.setVisible(false);
    	
    	a2Button.setVisible(false);
    	b2Button.setVisible(false);
    	c2Button.setVisible(false);
    	d2Button.setVisible(false);
    	e2Button.setVisible(false);
    	
    	a3Button.setVisible(false);
    	b3Button.setVisible(false);
    	c3Button.setVisible(false);
    	d3Button.setVisible(false);
    	e3Button.setVisible(false);
    	
    	a4Button.setVisible(false);
    	b4Button.setVisible(false);
    	c4Button.setVisible(false);
    	d4Button.setVisible(false);
    	e4Button.setVisible(false);
    	
    	a5Button.setVisible(false);
    	b5Button.setVisible(false);
    	c5Button.setVisible(false);
    	d5Button.setVisible(false);
    	e5Button.setVisible(false);
    	
    	labelA.setVisible(false);
    	labelB.setVisible(false);
    	labelC.setVisible(false);
    	labelD.setVisible(false);
    	labelE.setVisible(false);
    	label1.setVisible(false);
    	label2.setVisible(false);
    	label3.setVisible(false);
    	label4.setVisible(false);
    	label5.setVisible(false);
    	
    	markButton.setVisible(false);
    }
    
    
    
    public static void setMarkButtonText(String s) {
    	gameFinished = true;
    	markButton.setText(s);
    }
    
    public static void setTotalPoints(int n) {
    	totalPoints += n;
    	totalPointCounter.setText("" + totalPoints);
    	
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlipGUI().setVisible(true);
            }
        });
        
    }         
}
