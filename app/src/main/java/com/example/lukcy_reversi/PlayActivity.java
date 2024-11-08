package com.example.lukcy_reversi;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {

    private static final int SIZE = 8;
    private static final int EMPTY = 0;
    private static final int BLACK = 1;
    private static final int WHITE = 2;
    private int[][] board = new int[SIZE][SIZE];
    private boolean blackTurn = true;
    private ImageView[][] kuro = new ImageView[SIZE][SIZE];
    private ImageView[][] shiro = new ImageView[SIZE][SIZE];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        kuro[0][0] = findViewById(R.id.kuro_11);
        kuro[0][1] = findViewById(R.id.kuro_12);
        kuro[0][2] = findViewById(R.id.kuro_13);
        kuro[0][3] = findViewById(R.id.kuro_14);
        kuro[0][4] = findViewById(R.id.kuro_15);
        kuro[0][5] = findViewById(R.id.kuro_16);
        kuro[0][6] = findViewById(R.id.kuro_17);
        kuro[0][7] = findViewById(R.id.kuro_18);
        kuro[1][0] = findViewById(R.id.kuro_21);
        kuro[1][1] = findViewById(R.id.kuro_22);
        kuro[1][2] = findViewById(R.id.kuro_23);
        kuro[1][3] = findViewById(R.id.kuro_24);
        kuro[1][4] = findViewById(R.id.kuro_25);
        kuro[1][5] = findViewById(R.id.kuro_26);
        kuro[1][6] = findViewById(R.id.kuro_27);
        kuro[1][7] = findViewById(R.id.kuro_28);
        kuro[2][0] = findViewById(R.id.kuro_31);
        kuro[2][1] = findViewById(R.id.kuro_32);
        kuro[2][2] = findViewById(R.id.kuro_33);
        kuro[2][3] = findViewById(R.id.kuro_34);
        kuro[2][4] = findViewById(R.id.kuro_35);
        kuro[2][5] = findViewById(R.id.kuro_36);
        kuro[2][6] = findViewById(R.id.kuro_37);
        kuro[2][7] = findViewById(R.id.kuro_38);
        kuro[3][0] = findViewById(R.id.kuro_41);
        kuro[3][1] = findViewById(R.id.kuro_42);
        kuro[3][2] = findViewById(R.id.kuro_43);
        kuro[3][3] = findViewById(R.id.kuro_44);
        kuro[3][4] = findViewById(R.id.kuro_45);
        kuro[3][5] = findViewById(R.id.kuro_46);
        kuro[3][6] = findViewById(R.id.kuro_47);
        kuro[3][7] = findViewById(R.id.kuro_48);
        kuro[4][0] = findViewById(R.id.kuro_51);
        kuro[4][1] = findViewById(R.id.kuro_52);
        kuro[4][2] = findViewById(R.id.kuro_53);
        kuro[4][3] = findViewById(R.id.kuro_54);
        kuro[4][4] = findViewById(R.id.kuro_55);
        kuro[4][5] = findViewById(R.id.kuro_56);
        kuro[4][6] = findViewById(R.id.kuro_57);
        kuro[4][7] = findViewById(R.id.kuro_58);
        kuro[5][0] = findViewById(R.id.kuro_61);
        kuro[5][1] = findViewById(R.id.kuro_62);
        kuro[5][2] = findViewById(R.id.kuro_63);
        kuro[5][3] = findViewById(R.id.kuro_64);
        kuro[5][4] = findViewById(R.id.kuro_65);
        kuro[5][5] = findViewById(R.id.kuro_66);
        kuro[5][6] = findViewById(R.id.kuro_67);
        kuro[5][7] = findViewById(R.id.kuro_68);
        kuro[6][0] = findViewById(R.id.kuro_71);
        kuro[6][1] = findViewById(R.id.kuro_72);
        kuro[6][2] = findViewById(R.id.kuro_73);
        kuro[6][3] = findViewById(R.id.kuro_74);
        kuro[6][4] = findViewById(R.id.kuro_75);
        kuro[6][5] = findViewById(R.id.kuro_76);
        kuro[6][6] = findViewById(R.id.kuro_77);
        kuro[6][7] = findViewById(R.id.kuro_78);
        kuro[7][0] = findViewById(R.id.kuro_81);
        kuro[7][1] = findViewById(R.id.kuro_82);
        kuro[7][2] = findViewById(R.id.kuro_83);
        kuro[7][3] = findViewById(R.id.kuro_84);
        kuro[7][4] = findViewById(R.id.kuro_85);
        kuro[7][5] = findViewById(R.id.kuro_86);
        kuro[7][6] = findViewById(R.id.kuro_87);
        kuro[7][7] = findViewById(R.id.kuro_88);

        shiro[0][0] = findViewById(R.id.shiro_11);
        shiro[0][1] = findViewById(R.id.shiro_12);
        shiro[0][2] = findViewById(R.id.shiro_13);
        shiro[0][3] = findViewById(R.id.shiro_14);
        shiro[0][4] = findViewById(R.id.shiro_15);
        shiro[0][5] = findViewById(R.id.shiro_16);
        shiro[0][6] = findViewById(R.id.shiro_17);
        shiro[0][7] = findViewById(R.id.shiro_18);

        shiro[1][0] = findViewById(R.id.shiro_21);
        shiro[1][1] = findViewById(R.id.shiro_22);
        shiro[1][2] = findViewById(R.id.shiro_23);
        shiro[1][3] = findViewById(R.id.shiro_24);
        shiro[1][4] = findViewById(R.id.shiro_25);
        shiro[1][5] = findViewById(R.id.shiro_26);
        shiro[1][6] = findViewById(R.id.shiro_27);
        shiro[1][7] = findViewById(R.id.shiro_28);

        shiro[2][0] = findViewById(R.id.shiro_31);
        shiro[2][1] = findViewById(R.id.shiro_32);
        shiro[2][2] = findViewById(R.id.shiro_33);
        shiro[2][3] = findViewById(R.id.shiro_34);
        shiro[2][4] = findViewById(R.id.shiro_35);
        shiro[2][5] = findViewById(R.id.shiro_36);
        shiro[2][6] = findViewById(R.id.shiro_37);
        shiro[2][7] = findViewById(R.id.shiro_38);

        shiro[3][0] = findViewById(R.id.shiro_41);
        shiro[3][1] = findViewById(R.id.shiro_42);
        shiro[3][2] = findViewById(R.id.shiro_43);
        shiro[3][3] = findViewById(R.id.shiro_44);
        shiro[3][4] = findViewById(R.id.shiro_45);
        shiro[3][5] = findViewById(R.id.shiro_46);
        shiro[3][6] = findViewById(R.id.shiro_47);
        shiro[3][7] = findViewById(R.id.shiro_48);

        shiro[4][0] = findViewById(R.id.shiro_51);
        shiro[4][1] = findViewById(R.id.shiro_52);
        shiro[4][2] = findViewById(R.id.shiro_53);
        shiro[4][3] = findViewById(R.id.shiro_54);
        shiro[4][4] = findViewById(R.id.shiro_55);
        shiro[4][5] = findViewById(R.id.shiro_56);
        shiro[4][6] = findViewById(R.id.shiro_57);
        shiro[4][7] = findViewById(R.id.shiro_58);

        shiro[5][0] = findViewById(R.id.shiro_61);
        shiro[5][1] = findViewById(R.id.shiro_62);
        shiro[5][2] = findViewById(R.id.shiro_63);
        shiro[5][3] = findViewById(R.id.shiro_64);
        shiro[5][4] = findViewById(R.id.shiro_65);
        shiro[5][5] = findViewById(R.id.shiro_66);
        shiro[5][6] = findViewById(R.id.shiro_67);
        shiro[5][7] = findViewById(R.id.shiro_68);

        shiro[6][0] = findViewById(R.id.shiro_71);
        shiro[6][1] = findViewById(R.id.shiro_72);
        shiro[6][2] = findViewById(R.id.shiro_73);
        shiro[6][3] = findViewById(R.id.shiro_74);
        shiro[6][4] = findViewById(R.id.shiro_75);
        shiro[6][5] = findViewById(R.id.shiro_76);
        shiro[6][6] = findViewById(R.id.shiro_77);
        shiro[6][7] = findViewById(R.id.shiro_78);

        shiro[7][0] = findViewById(R.id.shiro_81);
        shiro[7][1] = findViewById(R.id.shiro_82);
        shiro[7][2] = findViewById(R.id.shiro_83);
        shiro[7][3] = findViewById(R.id.shiro_84);
        shiro[7][4] = findViewById(R.id.shiro_85);
        shiro[7][5] = findViewById(R.id.shiro_86);
        shiro[7][6] = findViewById(R.id.shiro_87);
        shiro[7][7] = findViewById(R.id.shiro_88);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                shiro[i][j].setVisibility(View.INVISIBLE);
                kuro[i][j].setVisibility(View.INVISIBLE);
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                final int row = i;
                final int col = j;
                shiro[i][j].setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        shiro[row][col].setVisibility(View.INVISIBLE);
                        kuro[row][col].setVisibility(View.VISIBLE);
                    }
                });
                kuro[i][j].setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        shiro[row][col].setVisibility(View.VISIBLE);
                        kuro[row][col].setVisibility(View.INVISIBLE);
                    }
                });
            }
        }
        board[3][3] = WHITE;
        board[3][4] = BLACK;
        board[4][3] = BLACK;
        board[4][4] = WHITE;
    }
}
