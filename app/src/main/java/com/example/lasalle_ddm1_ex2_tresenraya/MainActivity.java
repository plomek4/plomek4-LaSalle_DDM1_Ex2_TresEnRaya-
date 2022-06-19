package com.example.lasalle_ddm1_ex2_tresenraya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int[] player = {1};
    private int casillasOcupadas = 0;
    Board board;
    TextView tvPlayer;
    boolean gameWon = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView i0 = findViewById(R.id.imageView0);
        ImageView i1 = findViewById(R.id.imageView1);
        ImageView i2 = findViewById(R.id.imageView2);
        ImageView i3 = findViewById(R.id.imageView3);
        ImageView i4 = findViewById(R.id.imageView4);
        ImageView i5 = findViewById(R.id.imageView5);
        ImageView i6 = findViewById(R.id.imageView6);
        ImageView i7 = findViewById(R.id.imageView7);
        ImageView i8 = findViewById(R.id.imageView8);

        board = new Board(i0, i1, i2, i3, i4, i5, i6, i7, i8);

        tvPlayer = findViewById(R.id.playerInfo);
        tvPlayer.setText(R.string.player_1);

        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(1);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }

                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(2);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(3);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);

                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }

            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(4);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(5);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(6);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(7);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(8);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cell c = board.getCasillaById(9);
                if (!gameWon) {
                    if (c.isEmpty()) {

                        setDrawableCasilla(player[0], c);
                        c.fill();
                        c.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), R.string.used_cell, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_ended, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    private void checkGameEnd(TextView tvPlayer) {
        if (casillasOcupadas == 9) {
            tvPlayer.setText(R.string.game_ended);
        }
    }

    private int setPlayer(int player, TextView tvPlayer) {
        if (player == 1) {
            tvPlayer.setText(R.string.player_2);
            player++;
        } else if (player == 2) {
            tvPlayer.setText(R.string.player_1);
            player--;
        }
        return player;
    }

    private boolean checkGameWonByPlayer(int player) {
        if (board.checkGameWon(player)) {
            tvPlayer.setText(R.string.game_ended);
            gameWon = true;
            if (player == 1) {
                Toast.makeText(getApplicationContext(), R.string.player1_won, Toast.LENGTH_SHORT).show();
            } else if (player == 2) {
                Toast.makeText(getApplicationContext(), R.string.player2_won, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        return false;
    }

    private void setDrawableCasilla(int player, Cell c) {
        if (player == 1) {
            c.getImage().setImageResource(R.drawable.circle);
        } else if (player == 2) {
            c.getImage().setImageResource(R.drawable.cross);
        }
    }
}