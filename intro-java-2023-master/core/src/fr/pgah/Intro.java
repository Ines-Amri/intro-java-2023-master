package fr.pgah;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import org.w3c.dom.Text;

public class Intro extends ApplicationAdapter {
  private static final int _1 = 1;
  SpriteBatch batch;
  Texture[] imgs;
int[] coordonnesX;
int[] coordonnesY;



  int x;
  int x2;
  int y;
  int y2;
  int hauteurFenetre;
  int hauteurImg;
  int hauteurImg2;
  int valeur;
  boolean onMonte;// 0 pour monter et 1 pour descendre
  boolean onMonte2;
  

  @Override
  public void create() {
    batch = new SpriteBatch();
   // img = new Texture("sio.jpg");

    imgs = new Texture [2];
    imgs[0] = new Texture("sio.jpg");
    imgs[1]= new Texture ("badlogic.jpg");

  coordonnesX = new int[2];
  coordonnesX[0] = 0;
  coordonnesX[1] = 100;

  coordonnesY= new int[2];
  coordonnesY [0] = 0;
  coordonnesY[1] = 100; 


    x = 0;
    y = 0;
    valeur = 1;
    hauteurFenetre = Gdx.graphics.getHeight();
    hauteurImg = img.getHeight();
    onMonte = true;

  }

  @Override
  public void render() {

    reinitialiserBackground();
    testerBordures();
    majCoordonnes();
    Dessin();

  }

  private void Dessin() {
    batch.begin();
    batch.draw(imgs, x, y);
    batch.end();
  }
  private void majCoordonnes() {
    x=x+1;

    //if(directionEnY==0)
    if(onMonte==true)
  { y=y+1;} else {y = y -1;}
  }

  public void reinitialiserBackground() {
    ScreenUtils.clear(1, 0, 0, 1);  
  }

  public void testerBordures(){

     // tester bordure haute
     if (y + hauteurImg == hauteurFenetre) {// code si condition vraie
      onMonte=false;
      
    }
    //tester bordure basse
    if (y==0) {
      onMonte=true;
    }


  }
      
}
