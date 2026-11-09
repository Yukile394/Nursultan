package minecraft;

public enum class08247 {
   field_4997(4, true, true, true, false, true, 0, 8, 16, 255, 24, true),
   field_5001(3, true, true, true, false, false, 0, 8, 16, 255, 255, true),
   field_5002(2, false, false, false, true, true, 255, 255, 255, 0, 8, true),
   field_4998(1, false, false, false, true, false, 0, 0, 0, 0, 255, true);

   final int field_4994;
   private final boolean field_5005;
   private final boolean field_5004;
   private final boolean field_5003;
   private final boolean field_5000;
   private final boolean field_4999;
   private final int field_5010;
   private final int field_5009;
   private final int field_5008;
   private final int field_5007;
   private final int field_5006;
   private final boolean field_4996;

   public boolean L() {
      return this.field_5004;
   }

   public int M() {
      return this.field_5010;
   }

   public boolean P() {
      return this.field_5000 || this.field_4999;
   }

   public int T() {
      return this.field_5000 ? this.field_5007 : this.field_5009;
   }

   private class08247(
      int var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, int var9, int var10, int var11, int var12, int var13, boolean var14
   ) {
      this.field_4994 = var3;
      this.field_5005 = var4;
      this.field_5004 = var5;
      this.field_5003 = var6;
      this.field_5000 = var7;
      this.field_4999 = var8;
      this.field_5010 = var9;
      this.field_5009 = var10;
      this.field_5008 = var11;
      this.field_5007 = var12;
      this.field_5006 = var13;
      this.field_4996 = var14;
   }

   public int B() {
      return this.field_5009;
   }

   public int Z() {
      return this.field_5008;
   }

   public boolean i() {
      return this.field_5000;
   }

   public int b() {
      return this.field_5000 ? this.field_5007 : this.field_5008;
   }

   public int s() {
      return this.field_5000 ? this.field_5007 : this.field_5010;
   }

   public boolean m() {
      return this.field_5000 || this.field_5003;
   }

   public boolean v() {
      return this.field_4996;
   }

   public int j() {
      return this.field_5000 ? this.field_5007 : this.field_5006;
   }

   public int U() {
      return this.field_5006;
   }

   public int z() {
      return this.field_5007;
   }

   public boolean u() {
      return this.field_5003;
   }

   public boolean y() {
      return this.field_5005;
   }

   public boolean E() {
      return this.field_5000 || this.field_5005;
   }

   static class08247 N(int var0) {
      switch (var0) {
         case 1:
            return field_4998;
         case 2:
            return field_5002;
         case 3:
            return field_5001;
         case 4:
         default:
            return field_4997;
      }
   }

   public int N() {
      return this.field_4994;
   }

   public boolean W() {
      return this.field_5000 || this.field_5004;
   }

   public boolean R() {
      return this.field_4999;
   }
}
