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

        kuro[1][1] = findViewById(R.id.kuro_11);
        kuro[1][2] = findViewById(R.id.kuro_12);


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                    board[i][j] = EMPTY;
            }
        }
        board[3][3] = WHITE;
        board[3][4] = BLACK;
        board[4][3] = BLACK;
        board[4][4] = WHITE;
        }
    }
}