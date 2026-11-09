package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

public class class01421 {
   private final List<class01423> N = new ArrayList<>(16);
   private int y;

   public class01423 L() {
      return this.N.get(this.y);
   }

   public class01421() {
      super();
      this.N.add(new class01423());
   }

   public void i() {
      this.L().L();
   }

   public boolean u() {
      return this.y == 0;
   }

   public void y() {
      if (this.y == 0) {
         throw new NoSuchElementException();
      } else {
         this.y--;
      }
   }

   public void y(float var1, float var2, float var3) {
      this.L().y(var1, var2, var3);
   }

   public void N(Matrix4fc var1) {
      this.L().N(var1);
   }

   public void N() {
      class01423 class01423 = this.L();
      this.y++;
      if (this.y >= this.N.size()) {
         this.N.add(class01423.u());
      } else {
         this.N.get(this.y).N(class01423);
      }
   }

   public void N(double var1, double var3, double var5) {
      this.N((float)var1, (float)var3, (float)var5);
   }

   public void N(float var1, float var2, float var3) {
      this.L().N(var1, var2, var3);
   }

   public void N(class06889 var1) {
      this.N(var1.M, var1.B, var1.Z);
   }

   public void N(Quaternionfc var1) {
      this.L().N(var1);
   }

   public void N(Quaternionfc var1, float var2, float var3, float var4) {
      this.L().N(var1, var2, var3, var4);
   }
}
