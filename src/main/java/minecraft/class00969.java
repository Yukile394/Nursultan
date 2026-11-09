package minecraft;

import Nursultan.class09424;
import java.util.Arrays;

class class00969 {
   private int N = 1024;
   private float[] y = new float[12288];
   private int[] L = new int[2048];
   private int u;

   private void L() {
      this.N *= 2;
      this.y = Arrays.copyOf(this.y, this.N * 12);
      this.L = Arrays.copyOf(this.L, this.N * 2);
   }

   class00969() {
      super();
   }

   public int y() {
      return this.u;
   }

   public void N(class09424 var1) {
      for (int i = 0; i < this.u; i++) {
         int j = i * 12;
         int k = i * 2;
         var1.consume(
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j++],
            this.y[j],
            this.L[k++],
            this.L[k]
         );
      }
   }

   public void N(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      int var14
   ) {
      if (this.u >= this.N) {
         this.L();
      }

      int i = this.u * 12;
      this.y[i++] = var1;
      this.y[i++] = var2;
      this.y[i++] = var3;
      this.y[i++] = var4;
      this.y[i++] = var5;
      this.y[i++] = var6;
      this.y[i++] = var7;
      this.y[i++] = var8;
      this.y[i++] = var9;
      this.y[i++] = var10;
      this.y[i++] = var11;
      this.y[i] = var12;
      i = this.u * 2;
      this.L[i++] = var13;
      this.L[i] = var14;
      this.u++;
   }

   public void N() {
      this.u = 0;
   }
}
