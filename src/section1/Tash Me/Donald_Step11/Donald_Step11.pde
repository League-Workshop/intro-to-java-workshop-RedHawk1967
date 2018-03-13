PImage mustache;
PImage Donald;

void setup() {Donald = loadImage("Donald.jpg");
size(800,600);
Donald.resize(width,height); mustache = loadImage("mustache.png");
}
void draw(){image(mustache, 400, 300);
  background(Donald);
}