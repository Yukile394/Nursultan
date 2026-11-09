package minecraft;

public enum class06219 {
   private static String[] strings_01e6bc0aa454033828fc8487f86a51a5a;
   public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_0 = new class06219(strings_01e6bc0aa454033828fc8487f86a51a5a[0], 0, class05220.N) {
      @Override
      public boolean N(boolean var1) {
         return true;
      }
   };
   public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_1 = new class06219(
      strings_01e6bc0aa454033828fc8487f86a51a5a[1], 1, class00392.L(strings_01e6bc0aa454033828fc8487f86a51a5a[2]).N(class06541.field_1061)
   ) {
      @Override
      public boolean N(boolean var1) {
         return false;
      }
   };
   public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_2 = new class06219(
      strings_01e6bc0aa454033828fc8487f86a51a5a[3], 2, class00392.L(strings_01e6bc0aa454033828fc8487f86a51a5a[4]).N(class06541.field_1061)
   ) {
      @Override
      public boolean N(boolean var1) {
         return var1;
      }
   };
   public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_3 = new class06219(
      strings_01e6bc0aa454033828fc8487f86a51a5a[5],
      3,
      class00392.N(strings_01e6bc0aa454033828fc8487f86a51a5a[6], class00392.u(((class05630)((class06202)class06202.j_0).i_7).o.U())).N(class06541.field_1061)
   ) {
      @Override
      public boolean N(boolean var1) {
         return var1;
      }
   };
   public static Object staticFields_01e6bc0aa454033828fc8487f86a51a5a_4 = class00392.L(strings_01e6bc0aa454033828fc8487f86a51a5a[7]);
   public static class06219[] staticFields_01e6bc0aa454033828fc8487f86a51a5a_5 = B();
   public class00392 fields_01e6bc0aa454033828fc8487f86a51a5a_0;

   private static void L() {
   }

   public class06219(class00392 var3) {
      this.u();
      this.fields_01e6bc0aa454033828fc8487f86a51a5a_0 = var3;
   }

   static {
      y();
      L();
   }

   private void u() {
   }

   private static void y() {
      strings_01e6bc0aa454033828fc8487f86a51a5a = new String[8];
      strings_01e6bc0aa454033828fc8487f86a51a5a[0] = "ENABLED";
      strings_01e6bc0aa454033828fc8487f86a51a5a[1] = "DISABLED_BY_OPTIONS";
      strings_01e6bc0aa454033828fc8487f86a51a5a[2] = "chat.disabled.options";
      strings_01e6bc0aa454033828fc8487f86a51a5a[3] = "DISABLED_BY_LAUNCHER";
      strings_01e6bc0aa454033828fc8487f86a51a5a[4] = "chat.disabled.launcher";
      strings_01e6bc0aa454033828fc8487f86a51a5a[5] = "DISABLED_BY_PROFILE";
      strings_01e6bc0aa454033828fc8487f86a51a5a[6] = "chat.disabled.profile";
      strings_01e6bc0aa454033828fc8487f86a51a5a[7] = "chat.disabled.profile.moreInfo";
   }

   public class00392 N() {
      return this.fields_01e6bc0aa454033828fc8487f86a51a5a_0;
   }

   public abstract boolean N(boolean var1);
}
