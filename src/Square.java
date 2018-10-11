public class Square {
    int height = 1;
    int length = 1;


    public Square(int a, int b) {

        this.height = a;
         this.length = b;
    }
        public Square(int a){

             this.height = a;
             this.length = 5;
        }

            public Square() {
                this.height = 10;
                this.length = 10;
            }


            public int getArea(){
                return (this.height*this.length);

            }

            public int getPerimeter(){
                return (this.height*2) + (this.length*2);
            }



        }



