package com.lifeistech.android.original;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView cpuimage;
    TextView gamemaint;
    TextView chpt;
    TextView capt;
    TextView cdpt;
    TextView phpt;
    TextView papt;
    TextView pdpt;
    TextView p1t;
    TextView p2t;
    TextView p3t;
    ImageButton g1;
    ImageButton g2;
    ImageButton g3;

    int chp;
    int cap;
    int cdp;
    int php;
    int pap;
    int pdp;
    int p1;
    int p2;
    int p3;
    int item;
    int item2;
    int item3;
    int dam;
    Random r = new Random();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cpuimage = (ImageView) findViewById(R.id.cpu);
        gamemaint = (TextView) findViewById(R.id.gamemain);
        chpt = (TextView) findViewById(R.id.chp);
        capt = (TextView) findViewById(R.id.cap);
        cdpt = (TextView) findViewById(R.id.cdp);
        phpt = (TextView) findViewById(R.id.php);
        papt = (TextView) findViewById(R.id.pap);
        pdpt = (TextView) findViewById(R.id.pdp);
        p1t = (TextView) findViewById(R.id.p1);
        p2t = (TextView) findViewById(R.id.p2);
        p3t = (TextView) findViewById(R.id.p3);
        g1 = (ImageButton) findViewById(R.id.g1);
        g2 = (ImageButton) findViewById(R.id.g2);
        g3 = (ImageButton) findViewById(R.id.g3);

        intialMethod();
        start4();
    }

    private void intialMethod() {
        start1();
        start2();
        start3();

    }

    public void start1() {
        int random = r.nextInt(78);
        if ((random >= 0) && (random <= 2)) {
            g1.setImageResource(R.drawable.wood_sword);
            p1 = 3;
            p1t.setText("木の剣 攻" + p1);
            item = 1;
        } else if ((random >= 3) && (random <= 5)) {
            g1.setImageResource(R.drawable.stone_sword);
            p1 = 5;
            p1t.setText("石の剣 攻" + p1);
            item = 1;
        } else if ((random >= 6) && (random <= 7)) {
            g1.setImageResource(R.drawable.iron_sword);
            p1 = 7;
            p1t.setText("鉄の剣 攻" + p1);
            item = 1;
        } else if ((random >= 8) && (random <= 9)) {
            g1.setImageResource(R.drawable.gold_sword);
            p1 = 9;
            p1t.setText("金の剣 攻" + p1);
            item = 1;
        } else if (random == 10) {
            g1.setImageResource(R.drawable.diamond_sword);
            p2 = 11;
            p1t.setText("ダイヤの剣 攻" + p1);
            item = 1;
        } else if ((random >= 11) && (random <= 13)) {
            g1.setImageResource(R.drawable.bow_standby);
            p1 = 5;
            p1t.setText("弓 攻" + p1);
            item = 1;
        } else if ((random >= 14) && (random <= 15)) {
            g1.setImageResource(R.drawable.crossbow);
            p1 = 8;
            p1t.setText("クロスボウ 攻" + p1);
            item = 1;
        } else if ((random >= 16) && (random <= 18)) {
            g1.setImageResource(R.drawable.knife_iron);
            p1 = 5;
            p1t.setText("ナイフ 攻" + p1);
            item = 1;
        } else if ((random >= 19) && (random <= 20)) {
            g1.setImageResource(R.drawable.stick);
            p2 = 1;
            p1t.setText("棒 攻" + p1);
            item = 1;
        } else if ((random >= 21) && (random <= 24)) {
            g1.setImageResource(R.drawable.spear_wood);
            p1 = 7;
            p1t.setText("槍 攻" + p1);
            item = 1;
        } else if ((random >= 25) && (random <= 26)) {
            g1.setImageResource(R.drawable.warhammer_wood);
            p1 = 5;
            p1t.setText("木のハンマー 攻" + p1);
        } else if ((random >= 27) && (random <= 28)) {
            g1.setImageResource(R.drawable.warhammer_gold);
            p1 = 7;
            p1t.setText("石のハンマー 攻" + p1);
        } else if (random == 29) {
            g1.setImageResource(R.drawable.warhammer_iron);
            pap = 10;
            p1t.setText("鉄のハンマー 攻" + p1);
            item = 1;
        } else if (random == 30) {
            g1.setImageResource(R.drawable.warhammer_diamond);
            p1 = 13;
            p1t.setText("金のハンマー　攻" + p1);
            item = 1;
        } else if (random == 31) {
            g1.setImageResource(R.drawable.warhammer_diamond);
            p1 = 15;
            p1t.setText("ダイヤのハンマー 攻" + p1);
            item = 1;
        } else if ((random >= 32) && (random <= 34)) {
            g1.setImageResource(R.drawable.iron_helmet);
            p1 = 2;
            p1t.setText("鉄のヘルメット 防" + p1);
            item = 2;
        } else if ((random >= 35) && (random <= 37)) {
            g1.setImageResource(R.drawable.iron_chestplate);
            p1 = 4;
            p1t.setText("鉄のチェストプレート 防" + p1);
            item = 2;
        } else if ((random >= 38) && (random <= 40)) {
            g1.setImageResource(R.drawable.iron_leggings);
            p1 = 3;
            p1t.setText("鉄のレギンス 防" + p1);
            item = 2;
        } else if ((random >= 41) && (random <= 43)) {
            g1.setImageResource(R.drawable.iron_boots);
            p1 = 1;
            p1t.setText("鉄のブーツ 防" + p1);
            item = 2;
        } else if ((random >= 44) && (random <= 46)) {
            g1.setImageResource(R.drawable.gold_helmet);
            p1 = 4;
            p1t.setText("金のヘルメット 防" + p1);
            item = 2;
        } else if ((random >= 47) && (random <= 49)) {
            g1.setImageResource(R.drawable.gold_chestplate);
            p1 = 6;
            p1t.setText("金のチェストプレート 防" + p1);
            item = 2;
        } else if ((random >= 50) && (random <= 53)) {
            g1.setImageResource(R.drawable.gold_leggings);
            p1 = 5;
            p1t.setText("金のレギンス 防" + p1);
            item = 2;
        } else if ((random >= 54) && (random <= 56)) {
            g1.setImageResource(R.drawable.gold_boots);
            p1 = 3;
            p1t.setText("金のブーツ 防" + p1);
            item = 2;
        } else if (random == 57) {
            g1.setImageResource(R.drawable.diamond_helmet);
            p1 = 8;
            p1t.setText("ダイヤのヘルメット 防" + p1);
            item = 2;
        } else if (random == 58) {
            g1.setImageResource(R.drawable.diamond_chestplate);
            p1 = 15;
            p1t.setText("ダイヤのチェストプレート 防" + p1);
            item = 2;
        } else if (random == 59) {
            g1.setImageResource(R.drawable.diamond_leggings);
            p1 = 10;
            p1t.setText("ダイヤのレギンス 防" + p1);
            item = 2;
        } else if (random == 60) {
            g1.setImageResource(R.drawable.diamond_boots);
            p1 = 7;
            p1t.setText("ダイヤのブーツ 防" + p1);
            item = 2;
        } else if ((random >= 61) && (random <= 62)) {
            g1.setImageResource(R.drawable.apple);
            p1 = 5;
            p1t.setText("りんご HP+" + p1);
            item = 3;
        } else if ((random >= 63) && (random <= 64)) {
            g1.setImageResource(R.drawable.apple_golden);
            p1 = 10;
            p1t.setText("金のりんご HP+" + p1);
            item = 3;
        } else if ((random >= 65) && (random <= 66)) {
            g1.setImageResource(R.drawable.carrot);
            p1 = 3;
            p1t.setText("にんじん HP+" + p1);
            item = 3;
        } else if (random == 67) {
            g1.setImageResource(R.drawable.beef_cooked);
            p1 = 15;
            p1t.setText("ステーキ HP+" + p1);
            item = 3;
        } else if ((random >= 68) && (random <= 69)) {
            g1.setImageResource(R.drawable.porkchop_cooked);
            p1 = 10;
            p1t.setText("豚肉 HP+" + p1);
            item = 3;
        } else if ((random >= 76) && (random <= 77)) {
            g1.setImageResource(R.drawable.melon);
            p1 = 5;
            p1t.setText("スイカ HP+" + p1);
            item = 3;
        }
    }

    public void start2() {

        int random = r.nextInt(78);
        if ((random >= 0) && (random <= 2)) {
            g2.setImageResource(R.drawable.wood_sword);
            p2 = 3;
            p2t.setText("木の剣 攻" + p2);
            item2 = 1;
        } else if ((random >= 3) && (random <= 5)) {
            g2.setImageResource(R.drawable.stone_sword);
            p2 = 5;
            p2t.setText("石の剣 攻" + p2);
            item2 = 1;
        } else if ((random >= 6) && (random <= 7)) {
            g2.setImageResource(R.drawable.iron_sword);
            p2 = 7;
            p2t.setText("鉄の剣 攻" +p2);
            item2 = 1;
        } else if ((random >= 8) && (random <= 9)) {
            g2.setImageResource(R.drawable.gold_sword);
            p2 = 9;
            p2t.setText("金の剣 攻" + p2);
            item2 = 1;
        } else if (random == 10) {
            g2.setImageResource(R.drawable.diamond_sword);
            p2 = 11;
            p2t.setText("ダイヤの剣 攻" + p2);
            item2 = 1;
        } else if ((random >= 11) && (random <= 13)) {
            g2.setImageResource(R.drawable.bow_standby);
            p2 = 5;
            p2t.setText("弓 攻" + p2);
            item2 = 1;
        } else if ((random >= 14) && (random <= 15)) {
            g2.setImageResource(R.drawable.crossbow);
            p2 = 8;
            p2t.setText("クロスボウ 攻" + p2);
            item2 = 1;
        } else if ((random >= 16) && (random <= 18)) {
            g2.setImageResource(R.drawable.knife_iron);
            p2 = 5;
            p2t.setText("ナイフ 攻" + p2);
            item2 = 1;
        } else if ((random >= 19) && (random <= 20)) {
            g2.setImageResource(R.drawable.stick);
            p2 = 1;
            p2t.setText("棒 攻" + p2);
            item2 = 1;
        } else if ((random >= 21) && (random <= 24)) {
            g2.setImageResource(R.drawable.spear_wood);
            p2 = 7;
            p2t.setText("槍 攻" + p2);
            item2 = 1;
        } else if ((random >= 25) && (random <= 26)) {
            g2.setImageResource(R.drawable.warhammer_wood);
            p2 = 5;
            p2t.setText("木のハンマー 攻" + p2);
            item2 = 1;
        } else if ((random >= 27) && (random <= 28)) {
            g2.setImageResource(R.drawable.warhammer_gold);
            p2 = 7;
            p2t.setText("石のハンマー 攻" + p2);
            item2 = 1;
        } else if (random == 29) {
            g2.setImageResource(R.drawable.warhammer_iron);
            p2 = 10;
            p2t.setText("鉄のハンマー 攻" + p2);
            item2 = 1;
        } else if (random == 30) {
            g2.setImageResource(R.drawable.warhammer_diamond);
            p2 = 13;
            p2t.setText("金のハンマー　攻" + p2);
            item2 = 1;
        } else if (random == 31)  {
            g2.setImageResource(R.drawable.warhammer_diamond);
            p2 = 15;
            p2t.setText("ダイヤのハンマー 攻" + p2);
            item2 = 1;
        } else if ((random >= 32) && (random <= 34)) {
            g2.setImageResource(R.drawable.iron_helmet);
            p2 = 2;
            p2t.setText("鉄のヘルメット 防" + p2);
            item2 = 2;
        } else if ((random >= 35) && (random <= 37)) {
            g2.setImageResource(R.drawable.iron_chestplate);
            p2 = 4;
            p2t.setText("鉄のチェストプレート 防" + p2);
            item2 = 2;
        } else if ((random >= 38) && (random <= 40)) {
            g2.setImageResource(R.drawable.iron_leggings);
            p2 = 3;
            p2t.setText("鉄のレギンス 防" + p2);
            item2 = 2;
        } else if ((random >= 41) && (random <= 43)) {
            g2.setImageResource(R.drawable.iron_boots);
            p2 = 1;
            p2t.setText("鉄のブーツ 防" + p2);
            item2 = 2;
        } else if ((random >= 44) && (random <= 46)) {
            g2.setImageResource(R.drawable.gold_helmet);
            p2 = 4;
            p2t.setText("金のヘルメット 防" + p2);
            item2 = 2;
        } else if ((random >= 47) && (random <= 49)) {
            g2.setImageResource(R.drawable.gold_chestplate);
            p2 = 6;
            p2t.setText("金のチェストプレート 防" + p2);
            item2 = 2;
        } else if ((random >= 50) && (random <= 53)) {
            g2.setImageResource(R.drawable.gold_leggings);
            p2 = 5;
            p2t.setText("金のレギンス 防" + p2);
            item2 = 2;
        } else if ((random >= 54) && (random <= 56)) {
            g2.setImageResource(R.drawable.gold_boots);
            p2 = 3;
            p2t.setText("金のブーツ 防" + p2);
            item2 = 2;
        } else if (random == 57) {
            g2.setImageResource(R.drawable.diamond_helmet);
            p2 = 8;
            p2t.setText("ダイヤのヘルメット 防" + p2);
            item2 = 2;
        } else if (random == 58) {
            g2.setImageResource(R.drawable.diamond_chestplate);
            p2 = 15;
            p2t.setText("ダイヤのチェストプレート 防" + p2);
            item2 = 2;
        } else if (random == 59) {
            g2.setImageResource(R.drawable.diamond_leggings);
            p2 = 10;
            p2t.setText("ダイヤのレギンス 防" + p2);
            item2 = 2;
        } else if (random == 60) {
            g2.setImageResource(R.drawable.diamond_boots);
            p2 = 7;
            p2t.setText("ダイヤのブーツ 防" + p2);
            item2 = 2;
        } else if ((random >= 61) && (random <= 62)) {
            g2.setImageResource(R.drawable.apple);
            p2 = 5;
            p2t.setText("りんご HP+" + p2);
            item2 = 3;
        } else if ((random >= 63) && (random <= 64)) {
            g2.setImageResource(R.drawable.apple_golden);
            p2 = 10;
            p2t.setText("金のりんご HP+" + p2);
            item2 = 3;
        } else if ((random >= 65) && (random <= 66)) {
            g2.setImageResource(R.drawable.carrot);
            p2 = 3;
            p2t.setText("にんじん HP+" + p2);
            item2 = 2;
        } else if (random == 67)  {
            g2.setImageResource(R.drawable.beef_cooked);
            p2 = 15;
            p2t.setText("ステーキ HP+" + p2);
            item2 = 3;
        } else if ((random >= 68) && (random <= 69)) {
            g2.setImageResource(R.drawable.porkchop_cooked);
            p2 = 10;
            p2t.setText("豚肉 HP+" + p2);
            item2 = 3;
        } else if ((random >= 76) && (random <= 77)) {
            g2.setImageResource(R.drawable.melon);
            p2 = 5;
            p2t.setText("スイカ HP+" + p2);
            item2 = 3;
        }

    }

    public void start3() {

        int random = r.nextInt(78);
        if ((random >= 0) && (random <= 2)) {
            g3.setImageResource(R.drawable.wood_sword);
            p3 = 3;
            p3t.setText("木の剣 攻" + p3);
            item3 = 1;
        } else if ((random >= 3) && (random <= 5)) {
            g3.setImageResource(R.drawable.stone_sword);
            p3 = 5;
            p3t.setText("石の剣 攻" + p3);
            item3 = 1;
        } else if ((random >= 6) && (random <= 7)) {
            g3.setImageResource(R.drawable.iron_sword);
            p3 = 7;
            p3t.setText("鉄の剣 攻" +p3);
            item3 = 1;
        } else if ((random >= 8) && (random <= 9)) {
            g3.setImageResource(R.drawable.gold_sword);
            p3 = 9;
            p3t.setText("金の剣 攻" + p3);
            item3 = 1;
        } else if (random == 10) {
            g3.setImageResource(R.drawable.diamond_sword);
            p3 = 11;
            p3t.setText("ダイヤの剣 攻" + p3);
            item3 = 1;
        } else if ((random >= 11) && (random <= 13)) {
            g3.setImageResource(R.drawable.bow_standby);
            p3 = 5;
            p3t.setText("弓 攻" + p3);
            item3 = 1;
        } else if ((random >= 14) && (random <= 15)) {
            g3.setImageResource(R.drawable.crossbow);
            p3 = 8;
            p3t.setText("クロスボウ 攻" + p3);
            item3 = 1;
        } else if ((random >= 16) && (random <= 18)) {
            g3.setImageResource(R.drawable.knife_iron);
            p3 = 5;
            p3t.setText("ナイフ 攻" + p3);
            item3 = 1;
        } else if ((random >= 19) && (random <= 20)) {
            g3.setImageResource(R.drawable.stick);
            p3 = 1;
            p3t.setText("棒 攻" + p3);
            item3 = 1;
        } else if ((random >= 21) && (random <= 24)) {
            g3.setImageResource(R.drawable.spear_wood);
            p3 = 7;
            p3t.setText("槍 攻" + p3);
            item3 = 1;
        } else if ((random >= 25) && (random <= 26)) {
            g3.setImageResource(R.drawable.warhammer_wood);
            p3 = 5;
            p3t.setText("木のハンマー 攻" + p3);
            item3 = 1;
        } else if ((random >= 27) && (random <= 28)) {
            g3.setImageResource(R.drawable.warhammer_gold);
            p3 = 7;
            p3t.setText("石のハンマー 攻" + p3);
            item3 = 1;
        } else if (random == 29) {
            g3.setImageResource(R.drawable.warhammer_iron);
            p3 = 10;
            p3t.setText("鉄のハンマー 攻" + p3);
            item3 = 1;
        } else if (random == 30) {
            g3.setImageResource(R.drawable.warhammer_diamond);
            p3 = 13;
            p3t.setText("金のハンマー　攻" + p3);
            item3 = 1;
        } else if (random == 31)  {
            g3.setImageResource(R.drawable.warhammer_diamond);
            p3 = 15;
            p3t.setText("ダイヤのハンマー 攻" + p3);
            item3 = 1;
        } else if ((random >= 32) && (random <= 34)) {
            g3.setImageResource(R.drawable.iron_helmet);
            p3 = 2;
            p3t.setText("鉄のヘルメット 防" + p3);
            item3 = 2;
        } else if ((random >= 35) && (random <= 37)) {
            g3.setImageResource(R.drawable.iron_chestplate);
            p3 = 4;
            p3t.setText("鉄のチェストプレート 防" + p2);
            item3 = 2;
        } else if ((random >= 38) && (random <= 40)) {
            g3.setImageResource(R.drawable.iron_leggings);
            p3 = 3;
            p3t.setText("鉄のレギンス 防" + p3);
            item3 = 2;
        } else if ((random >= 41) && (random <= 43)) {
            g3.setImageResource(R.drawable.iron_boots);
            p3 = 1;
            p3t.setText("鉄のブーツ 防" + p3);
            item3 = 2;
        } else if ((random >= 44) && (random <= 46)) {
            g3.setImageResource(R.drawable.gold_helmet);
            p3 = 4;
            p3t.setText("金のヘルメット 防" + p3);
            item3 = 2;
        } else if ((random >= 47) && (random <= 49)) {
            g3.setImageResource(R.drawable.gold_chestplate);
            p3 = 6;
            p3t.setText("金のチェストプレート 防" + p3);
            item3 = 2;
        } else if ((random >= 50) && (random <= 53)) {
            g3.setImageResource(R.drawable.gold_leggings);
            p3 = 5;
            p3t.setText("金のレギンス 防" + p3);
            item3 = 2;
        } else if ((random >= 54) && (random <= 56)) {
            g3.setImageResource(R.drawable.gold_boots);
            p3 = 3;
            p3t.setText("金のブーツ 防" + p3);
            item3 = 2;
        } else if (random == 57) {
            g3.setImageResource(R.drawable.diamond_helmet);
            p3 = 8;
            p3t.setText("ダイヤのヘルメット 防" + p3);
            item3 = 2;
        } else if (random == 58) {
            g3.setImageResource(R.drawable.diamond_chestplate);
            p3 = 15;
            p3t.setText("ダイヤのチェストプレート 防" + p3);
            item3 = 2;
        } else if (random == 59) {
            g3.setImageResource(R.drawable.diamond_leggings);
            p3 = 10;
            p3t.setText("ダイヤのレギンス 防" + p3);
            item3 = 2;
        } else if (random == 60) {
            g3.setImageResource(R.drawable.diamond_boots);
            p3 = 7;
            p3t.setText("ダイヤのブーツ 防" + p3);
            item3 = 2;
        } else if ((random >= 61) && (random <= 62)) {
            g3.setImageResource(R.drawable.apple);
            p3 = 5;
            p3t.setText("りんご HP+" + p3);
            item3 = 3;
        } else if ((random >= 63) && (random <= 64)) {
            g3.setImageResource(R.drawable.apple_golden);
            p3 = 10;
            p3t.setText("金のりんご HP+" + p3);
            item3 = 3;
        } else if ((random >= 65) && (random <= 66)) {
            g3.setImageResource(R.drawable.carrot);
            p3 = 3;
            p3t.setText("にんじん HP+" + p3);
            item3 = 3;
        } else if (random == 67)  {
            g3.setImageResource(R.drawable.beef_cooked);
            p3 = 15;
            p3t.setText("ステーキ HP+" + p3);
            item3 = 3;
        } else if ((random >= 68) && (random <= 69)) {
            g3.setImageResource(R.drawable.porkchop_cooked);
            p3 = 10;
            p3t.setText("豚肉 HP+" + p3);
            item3 = 3;
        } else if ((random >= 76) && (random <= 77)) {
            g3.setImageResource(R.drawable.melon);
            p3 = 5;
            p3t.setText("スイカ HP+" + p3);
            item3 = 3;
        }
    }

    public void start4() {
        chp = 40;
        chpt.setText("HP " + chp);
        capt.setText("");
        cdpt.setText("");
        php = 40;
        phpt.setText("HP " + php);
        papt.setText("");
        pdpt.setText("");
    }

    public void g1(View v) {

        if (item == 1){
            int random = r.nextInt(2);
            if (random == 0){
                int random1 =r.nextInt(29);
                if ((random1 >= 0) && (random1 <= 2)) {
                    cpuimage.setImageResource(R.drawable.iron_helmet);
                    cdp = 2;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 3) && (random1 <= 5)) {
                    cpuimage.setImageResource(R.drawable.iron_chestplate);
                    cdp = 4;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 6) && (random1 <= 9)) {
                    cpuimage.setImageResource(R.drawable.iron_leggings);
                    cdp = 3;
                    cdpt.setText("防" + cdp);
                    item3 = 2;
                } else if ((random1 >= 10) && (random1 <= 12)) {
                    cpuimage.setImageResource(R.drawable.iron_boots);
                    cdp = 1;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 13) && (random1 <= 15)) {
                    cpuimage.setImageResource(R.drawable.gold_helmet);
                    cdp = 4;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 16) && (random1 <= 18)) {
                    cpuimage.setImageResource(R.drawable.gold_chestplate);
                    cdp = 6;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 19) && (random1 <= 21)) {
                    cpuimage.setImageResource(R.drawable.gold_leggings);
                    cdp = 5;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 22) && (random1 <= 24)) {
                    cpuimage.setImageResource(R.drawable.gold_boots);
                    cdp = 3;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 25) {
                    cpuimage.setImageResource(R.drawable.diamond_helmet);
                    cdp = 8;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 26) {
                    cpuimage.setImageResource(R.drawable.diamond_chestplate);
                    cdp = 15;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 27) {
                    cpuimage.setImageResource(R.drawable.diamond_leggings);
                    cdp = 10;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 28) {
                    g3.setImageResource(R.drawable.diamond_boots);
                    p3 = 7;
                    p3t.setText("防" + cdp);
                }

                dam = p1 - cdp;
                if (dam > 0) {
                    chp = chp - dam;
                    chpt.setText("HP " + chp);
                    gamemaint.setText("CPUに" + dam + "のダメージ！");
                } else if (dam <= 0) {
                    gamemaint.setText("防がれた！");
                    return;
                }

            } else if (random == 1) {
                dam = p1;
                chp = chp - dam;
                chpt.setText("HP " + chp);
                gamemaint.setText("CPUに" + dam + "のダメージ！");
            }

            gamemaint.setText("CPUのターン！");
            int random1 = r.nextInt(78);
            if ((random1 >= 0) && (random1 <= 2)) {
                cpuimage.setImageResource(R.drawable.wood_sword);
                cap = 3;
                capt.setText("攻" + cap);
            } else if ((random1 >= 3) && (random1 <= 5)) {
                cpuimage.setImageResource(R.drawable.stone_sword);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 6) && (random1 <= 7)) {
                cpuimage.setImageResource(R.drawable.iron_sword);
                cap = 7;
                capt.setText("攻" +cap);
            } else if ((random1 >= 8) && (random1 <= 9)) {
                cpuimage.setImageResource(R.drawable.gold_sword);
                cap = 9;
                capt.setText("攻" + cap);
            } else if (random1 == 10) {
                cpuimage.setImageResource(R.drawable.diamond_sword);
                cap = 11;
                capt.setText("攻" + cap);
            } else if ((random1 >= 11) && (random1 <= 13)) {
                cpuimage.setImageResource(R.drawable.bow_standby);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 14) && (random1 <= 15)) {
                cpuimage.setImageResource(R.drawable.crossbow);
                cap = 8;
                capt.setText("攻" + cap);
            } else if ((random1 >= 16) && (random1 <= 18)) {
                cpuimage.setImageResource(R.drawable.knife_iron);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 19) && (random1 <= 20)) {
                cpuimage.setImageResource(R.drawable.stick);
                cap = 1;
                capt.setText("攻" + cap);
            } else if ((random1 >= 21) && (random1 <= 24)) {
                cpuimage.setImageResource(R.drawable.spear_wood);
                cap = 7;
                capt.setText("攻" + cap);
            } else if ((random1 >= 25) && (random1 <= 26)) {
                cpuimage.setImageResource(R.drawable.warhammer_wood);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 27) && (random1 <= 28)) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 7;
                capt.setText("攻" + cap);
            } else if (random1 == 29) {
                cpuimage.setImageResource(R.drawable.warhammer_iron);
                cap = 10;
                capt.setText("攻" + cap);
            } else if (random1 == 30) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 13;
                capt.setText("攻" + cap);
            } else if (random1 == 31) {
                cpuimage.setImageResource(R.drawable.warhammer_diamond);
                cap = 15;
                capt.setText("攻" + cap);
            }

            if (item == 2) {
                dam = cap - p1;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item2 == 2) {
                dam = cap - p2;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item3 == 2) {
                dam = cap - p3;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else {
                dam = cap;
                php = php - dam;
                phpt.setText(php);
                gamemaint.setText(dam + "ダメージ受けた！");

            }

            if (php < 0 || chp < 0) {
                gamemaint.setText("ゲームは終了しました");
            } else {
                intialMethod();
            }

        } else if (item == 2) {
            Toast.makeText(this,"選択できません",Toast.LENGTH_SHORT).show();
        } else if (item == 3) {
            php = php + p1;
            phpt.setText(php);
            gamemaint.setText(p1 + "回復した！");

            gamemaint.setText("CPUのターン！");
            int random1 = r.nextInt(78);
            if ((random1 >= 0) && (random1 <= 2)) {
                cpuimage.setImageResource(R.drawable.wood_sword);
                cap = 3;
                capt.setText("攻" + cap);
            } else if ((random1 >= 3) && (random1 <= 5)) {
                cpuimage.setImageResource(R.drawable.stone_sword);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 6) && (random1 <= 7)) {
                cpuimage.setImageResource(R.drawable.iron_sword);
                cap = 7;
                capt.setText("攻" +cap);
            } else if ((random1 >= 8) && (random1 <= 9)) {
                cpuimage.setImageResource(R.drawable.gold_sword);
                cap = 9;
                capt.setText("攻" + cap);
            } else if (random1 == 10) {
                cpuimage.setImageResource(R.drawable.diamond_sword);
                cap = 11;
                capt.setText("攻" + cap);
            } else if ((random1 >= 11) && (random1 <= 13)) {
                cpuimage.setImageResource(R.drawable.bow_standby);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 14) && (random1 <= 15)) {
                cpuimage.setImageResource(R.drawable.crossbow);
                cap = 8;
                capt.setText("攻" + cap);
            } else if ((random1 >= 16) && (random1 <= 18)) {
                cpuimage.setImageResource(R.drawable.knife_iron);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 19) && (random1 <= 20)) {
                cpuimage.setImageResource(R.drawable.stick);
                cap = 1;
                capt.setText("攻" + cap);
            } else if ((random1 >= 21) && (random1 <= 24)) {
                cpuimage.setImageResource(R.drawable.spear_wood);
                cap = 7;
                capt.setText("攻" + cap);
            } else if ((random1 >= 25) && (random1 <= 26)) {
                cpuimage.setImageResource(R.drawable.warhammer_wood);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 27) && (random1 <= 28)) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 7;
                capt.setText("攻" + cap);
            } else if (random1 == 29) {
                cpuimage.setImageResource(R.drawable.warhammer_iron);
                cap = 10;
                capt.setText("攻" + cap);
            } else if (random1 == 30) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 13;
                capt.setText("攻" + cap);
            } else if (random1 == 31) {
                cpuimage.setImageResource(R.drawable.warhammer_diamond);
                cap = 15;
                capt.setText("攻" + cap);
            }

            if (item == 2) {
                dam = cap - p1;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item2 == 2) {
                dam = cap - p2;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item3 == 2) {
                dam = cap - p3;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else {
                dam = cap;
                php = php - dam;
                phpt.setText(php);
                gamemaint.setText(dam + "ダメージ受けた！");


            }

            if (php < 0 || chp < 0) {
                gamemaint.setText("ゲームは終了しました");
            } else {
                intialMethod();
            }

        }

    }

    public void g2(View v) {

        if (item2 == 1){
            int random = r.nextInt(2);
            if (random == 0){
                int random1 =r.nextInt(29);
                if ((random1 >= 0) && (random1 <= 2)) {
                    cpuimage.setImageResource(R.drawable.iron_helmet);
                    cdp = 2;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 3) && (random1 <= 5)) {
                    cpuimage.setImageResource(R.drawable.iron_chestplate);
                    cdp = 4;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 6) && (random1 <= 9)) {
                    cpuimage.setImageResource(R.drawable.iron_leggings);
                    cdp = 3;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 10) && (random1 <= 12)) {
                    cpuimage.setImageResource(R.drawable.iron_boots);
                    cdp = 1;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 13) && (random1 <= 15)) {
                    cpuimage.setImageResource(R.drawable.gold_helmet);
                    cdp = 4;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 16) && (random1 <= 18)) {
                    cpuimage.setImageResource(R.drawable.gold_chestplate);
                    cdp = 6;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 19) && (random1 <= 21)) {
                    cpuimage.setImageResource(R.drawable.gold_leggings);
                    cdp = 5;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 22) && (random1 <= 24)) {
                    cpuimage.setImageResource(R.drawable.gold_boots);
                    cdp = 3;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 25) {
                    cpuimage.setImageResource(R.drawable.diamond_helmet);
                    cdp = 8;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 26) {
                    cpuimage.setImageResource(R.drawable.diamond_chestplate);
                    cdp = 15;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 27) {
                    cpuimage.setImageResource(R.drawable.diamond_leggings);
                    cdp = 10;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 28) {
                    g3.setImageResource(R.drawable.diamond_boots);
                    p3 = 7;
                    p3t.setText("防" + cdp);
                }

                dam = p1 - cdp;
                if (dam > 0) {
                    chp = chp - dam;
                    chpt.setText("HP " + chp);
                    gamemaint.setText("CPUに" + dam + "のダメージ！");
                } else if (dam <= 0) {
                    gamemaint.setText("防がれた！");
                }

            } else if (random == 1) {
                dam = p1;
                chp = chp - dam;
                chpt.setText("HP " + chp);
                gamemaint.setText("CPUに" + dam + "のダメージ！");
            }

            gamemaint.setText("CPUのターン！");
            int random1 = r.nextInt(78);
            if ((random1 >= 0) && (random1 <= 2)) {
                cpuimage.setImageResource(R.drawable.wood_sword);
                cap = 3;
                capt.setText("攻" + cap);
            } else if ((random1 >= 3) && (random1 <= 5)) {
                cpuimage.setImageResource(R.drawable.stone_sword);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 6) && (random1 <= 7)) {
                cpuimage.setImageResource(R.drawable.iron_sword);
                cap = 7;
                capt.setText("攻" +cap);
            } else if ((random1 >= 8) && (random1 <= 9)) {
                cpuimage.setImageResource(R.drawable.gold_sword);
                cap = 9;
                capt.setText("攻" + cap);
            } else if (random1 == 10) {
                cpuimage.setImageResource(R.drawable.diamond_sword);
                cap = 11;
                capt.setText("攻" + cap);
            } else if ((random1 >= 11) && (random1 <= 13)) {
                cpuimage.setImageResource(R.drawable.bow_standby);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 14) && (random1 <= 15)) {
                cpuimage.setImageResource(R.drawable.crossbow);
                cap = 8;
                capt.setText("攻" + cap);
            } else if ((random1 >= 16) && (random1 <= 18)) {
                cpuimage.setImageResource(R.drawable.knife_iron);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 19) && (random1 <= 20)) {
                cpuimage.setImageResource(R.drawable.stick);
                cap = 1;
                capt.setText("攻" + cap);
            } else if ((random1 >= 21) && (random1 <= 24)) {
                cpuimage.setImageResource(R.drawable.spear_wood);
                cap = 7;
                capt.setText("攻" + cap);
            } else if ((random1 >= 25) && (random1 <= 26)) {
                cpuimage.setImageResource(R.drawable.warhammer_wood);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 27) && (random1 <= 28)) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 7;
                capt.setText("攻" + cap);
            } else if (random1 == 29) {
                cpuimage.setImageResource(R.drawable.warhammer_iron);
                cap = 10;
                capt.setText("攻" + cap);
            } else if (random1 == 30) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 13;
                capt.setText("攻" + cap);
            } else if (random1 == 31) {
                cpuimage.setImageResource(R.drawable.warhammer_diamond);
                cap = 15;
                capt.setText("攻" + cap);
            }

            if (item == 2) {
                dam = cap - p1;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item2 == 2) {
                dam = cap - p2;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item3 == 2) {
                dam = cap - p3;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else {
                dam = cap;
                php = php - dam;
                phpt.setText(php);
                gamemaint.setText(dam + "ダメージ受けた！");


            }

            if (php < 0 || chp < 0) {
                gamemaint.setText("ゲームは終了しました");
            } else {
                intialMethod();
            }

        } else if (item2 == 2) {
            Toast.makeText(this,"選択できません",Toast.LENGTH_SHORT).show();
        } else if (item2 == 3) {
            php = php + p1;
            phpt.setText(php);
            gamemaint.setText(p1 + "回復した！");
            gamemaint.setText("CPUのターン！");
            int random1 = r.nextInt(78);
            if ((random1 >= 0) && (random1 <= 2)) {
                cpuimage.setImageResource(R.drawable.wood_sword);
                cap = 3;
                capt.setText("攻" + cap);
            } else if ((random1 >= 3) && (random1 <= 5)) {
                cpuimage.setImageResource(R.drawable.stone_sword);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 6) && (random1 <= 7)) {
                cpuimage.setImageResource(R.drawable.iron_sword);
                cap = 7;
                capt.setText("攻" +cap);
            } else if ((random1 >= 8) && (random1 <= 9)) {
                cpuimage.setImageResource(R.drawable.gold_sword);
                cap = 9;
                capt.setText("攻" + cap);
            } else if (random1 == 10) {
                cpuimage.setImageResource(R.drawable.diamond_sword);
                cap = 11;
                capt.setText("攻" + cap);
            } else if ((random1 >= 11) && (random1 <= 13)) {
                cpuimage.setImageResource(R.drawable.bow_standby);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 14) && (random1 <= 15)) {
                cpuimage.setImageResource(R.drawable.crossbow);
                cap = 8;
                capt.setText("攻" + cap);
            } else if ((random1 >= 16) && (random1 <= 18)) {
                cpuimage.setImageResource(R.drawable.knife_iron);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 19) && (random1 <= 20)) {
                cpuimage.setImageResource(R.drawable.stick);
                cap = 1;
                capt.setText("攻" + cap);
            } else if ((random1 >= 21) && (random1 <= 24)) {
                cpuimage.setImageResource(R.drawable.spear_wood);
                cap = 7;
                capt.setText("攻" + cap);
            } else if ((random1 >= 25) && (random1 <= 26)) {
                cpuimage.setImageResource(R.drawable.warhammer_wood);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 27) && (random1 <= 28)) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 7;
                capt.setText("攻" + cap);
            } else if (random1 == 29) {
                cpuimage.setImageResource(R.drawable.warhammer_iron);
                cap = 10;
                capt.setText("攻" + cap);
            } else if (random1 == 30) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 13;
                capt.setText("攻" + cap);
            } else if (random1 == 31) {
                cpuimage.setImageResource(R.drawable.warhammer_diamond);
                cap = 15;
                capt.setText("攻" + cap);
            }

            if (item == 2) {
                dam = cap - p1;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item2 == 2) {
                dam = cap - p2;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item3 == 2) {
                dam = cap - p3;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else {
                dam = cap;
                php = php - dam;
                phpt.setText(php);
                gamemaint.setText(dam + "ダメージ受けた！");

                if (php < 0 || chp < 0) {
                    gamemaint.setText("ゲームは終了しました");
                } else {
                    intialMethod();
                }


            }

        }

    }

    public void g3(View v) {

        if (item == 1){
            int random = r.nextInt(2);
            if (random == 0){
                int random1 =r.nextInt(29);
                if ((random1 >= 0) && (random1 <= 2)) {
                    cpuimage.setImageResource(R.drawable.iron_helmet);
                    cdp = 2;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 3) && (random1 <= 5)) {
                    cpuimage.setImageResource(R.drawable.iron_chestplate);
                    cdp = 4;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 6) && (random1 <= 9)) {
                    cpuimage.setImageResource(R.drawable.iron_leggings);
                    cdp = 3;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 10) && (random1 <= 12)) {
                    cpuimage.setImageResource(R.drawable.iron_boots);
                    cdp = 1;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 13) && (random1 <= 15)) {
                    cpuimage.setImageResource(R.drawable.gold_helmet);
                    cdp = 4;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 16) && (random1 <= 18)) {
                    cpuimage.setImageResource(R.drawable.gold_chestplate);
                    cdp = 6;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 19) && (random1 <= 21)) {
                    cpuimage.setImageResource(R.drawable.gold_leggings);
                    cdp = 5;
                    cdpt.setText("防" + cdp);
                } else if ((random1 >= 22) && (random1 <= 24)) {
                    cpuimage.setImageResource(R.drawable.gold_boots);
                    cdp = 3;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 25) {
                    cpuimage.setImageResource(R.drawable.diamond_helmet);
                    cdp = 8;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 26) {
                    cpuimage.setImageResource(R.drawable.diamond_chestplate);
                    cdp = 15;
                    cdpt.setText("防" + cdp);
                    item3 = 2;
                } else if (random1 == 27) {
                    cpuimage.setImageResource(R.drawable.diamond_leggings);
                    cdp = 10;
                    cdpt.setText("防" + cdp);
                } else if (random1 == 28) {
                    g3.setImageResource(R.drawable.diamond_boots);
                    p3 = 7;
                    p3t.setText("防" + cdp);
                }

                dam = p1 - cdp;
                if (dam > 0) {
                    chp = chp - dam;
                    chpt.setText("HP " + chp);
                    gamemaint.setText("CPUに" + dam + "のダメージ！");
                } else if (dam <= 0) {
                    gamemaint.setText("防がれた！");
                }

            } else if (random == 1) {
                dam = p1;
                chp = chp - dam;
                chpt.setText("HP " + chp);
                gamemaint.setText("CPUに" + dam + "のダメージ！");
            }

            gamemaint.setText("CPUのターン！");
            int random1 = r.nextInt(78);
            if ((random1 >= 0) && (random1 <= 2)) {
                cpuimage.setImageResource(R.drawable.wood_sword);
                cap = 3;
                capt.setText("攻" + cap);
            } else if ((random1 >= 3) && (random1 <= 5)) {
                cpuimage.setImageResource(R.drawable.stone_sword);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 6) && (random1 <= 7)) {
                cpuimage.setImageResource(R.drawable.iron_sword);
                cap = 7;
                capt.setText("攻" +cap);
            } else if ((random1 >= 8) && (random1 <= 9)) {
                cpuimage.setImageResource(R.drawable.gold_sword);
                cap = 9;
                capt.setText("攻" + cap);
            } else if (random1 == 10) {
                cpuimage.setImageResource(R.drawable.diamond_sword);
                cap = 11;
                capt.setText("攻" + cap);
            } else if ((random1 >= 11) && (random1 <= 13)) {
                cpuimage.setImageResource(R.drawable.bow_standby);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 14) && (random1 <= 15)) {
                cpuimage.setImageResource(R.drawable.crossbow);
                cap = 8;
                capt.setText("攻" + cap);
            } else if ((random1 >= 16) && (random1 <= 18)) {
                cpuimage.setImageResource(R.drawable.knife_iron);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 19) && (random1 <= 20)) {
                cpuimage.setImageResource(R.drawable.stick);
                cap = 1;
                capt.setText("攻" + cap);
                item3 = 1;
            } else if ((random1 >= 21) && (random1 <= 24)) {
                cpuimage.setImageResource(R.drawable.spear_wood);
                cap = 7;
                capt.setText("攻" + cap);
            } else if ((random1 >= 25) && (random1 <= 26)) {
                cpuimage.setImageResource(R.drawable.warhammer_wood);
                cap = 5;
                capt.setText("攻" + cap);
                item3 = 1;
            } else if ((random1 >= 27) && (random1 <= 28)) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 7;
                capt.setText("攻" + cap);
            } else if (random1 == 29) {
                cpuimage.setImageResource(R.drawable.warhammer_iron);
                cap = 10;
                capt.setText("攻" + cap);
            } else if (random1 == 30) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 13;
                capt.setText("攻" + cap);
            } else if (random1 == 31) {
                cpuimage.setImageResource(R.drawable.warhammer_diamond);
                cap = 15;
                capt.setText("攻" + cap);
            }

            if (item == 2) {
                dam = cap - p1;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item2 == 2) {
                dam = cap - p2;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item3 == 2) {
                dam = cap - p3;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else {
                dam = cap;
                php = php - dam;
                phpt.setText(php);
                gamemaint.setText(dam + "ダメージ受けた！");


            }

            if (php < 0 || chp < 0) {
                gamemaint.setText("ゲームは終了しました");
            } else {
                intialMethod();
            }


        } else if (item3 == 2) {
            Toast.makeText(this,"選択できません",Toast.LENGTH_SHORT).show();
        } else if (item3 == 3) {
            php = php + p1;
            phpt.setText(php);
            gamemaint.setText(p1 + "回復した！");
            gamemaint.setText("CPUのターン！");
            int random1 = r.nextInt(78);
            if ((random1 >= 0) && (random1 <= 2)) {
                cpuimage.setImageResource(R.drawable.wood_sword);
                cap = 3;
                capt.setText("攻" + cap);
            } else if ((random1 >= 3) && (random1 <= 5)) {
                cpuimage.setImageResource(R.drawable.stone_sword);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 6) && (random1 <= 7)) {
                cpuimage.setImageResource(R.drawable.iron_sword);
                cap = 7;
                capt.setText("攻" +cap);
            } else if ((random1 >= 8) && (random1 <= 9)) {
                cpuimage.setImageResource(R.drawable.gold_sword);
                cap = 9;
                capt.setText("攻" + cap);
            } else if (random1 == 10) {
                cpuimage.setImageResource(R.drawable.diamond_sword);
                cap = 11;
                capt.setText("攻" + cap);
            } else if ((random1 >= 11) && (random1 <= 13)) {
                cpuimage.setImageResource(R.drawable.bow_standby);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 14) && (random1 <= 15)) {
                cpuimage.setImageResource(R.drawable.crossbow);
                cap = 8;
                capt.setText("攻" + cap);
            } else if ((random1 >= 16) && (random1 <= 18)) {
                cpuimage.setImageResource(R.drawable.knife_iron);
                cap = 5;
                capt.setText("攻" + cap);
            } else if ((random1 >= 19) && (random1 <= 20)) {
                cpuimage.setImageResource(R.drawable.stick);
                cap = 1;
                capt.setText("攻" + cap);
                item3 = 1;
            } else if ((random1 >= 21) && (random1 <= 24)) {
                cpuimage.setImageResource(R.drawable.spear_wood);
                cap = 7;
                capt.setText("攻" + cap);
            } else if ((random1 >= 25) && (random1 <= 26)) {
                cpuimage.setImageResource(R.drawable.warhammer_wood);
                cap = 5;
                capt.setText("攻" + cap);
                item3 = 1;
            } else if ((random1 >= 27) && (random1 <= 28)) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 7;
                capt.setText("攻" + cap);
            } else if (random1 == 29) {
                cpuimage.setImageResource(R.drawable.warhammer_iron);
                cap = 10;
                capt.setText("攻" + cap);
            } else if (random1 == 30) {
                cpuimage.setImageResource(R.drawable.warhammer_gold);
                cap = 13;
                capt.setText("攻" + cap);
            } else if (random1 == 31) {
                cpuimage.setImageResource(R.drawable.warhammer_diamond);
                cap = 15;
                capt.setText("攻" + cap);
            }

            if (item == 2) {
                dam = cap - p1;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item2 == 2) {
                dam = cap - p2;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else if (item3 == 2) {
                dam = cap - p3;
                if (dam < 0){
                    gamemaint.setText("防いだ！");
                } else if (dam >= 0) {
                    php = php - dam;
                    phpt.setText(php);
                    gamemaint.setText(dam + "ダメージ受けた！");
                }
            } else {
                dam = cap;
                php = php - dam;
                phpt.setText(php);
                gamemaint.setText(dam + "ダメージ受けた！");

            }

            if (php < 0 || chp < 0) {
                gamemaint.setText("ゲームは終了しました");
            } else {
                intialMethod();
            }


        }

    }

    public void skip(View v) {
        intialMethod();
    }
}
