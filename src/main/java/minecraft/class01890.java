package minecraft;

import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public enum class01890 implements class05033 {
   field_45156(0, "list"),
   field_45157(1, "sidebar"),
   field_45158(2, "below_name"),
   field_45159(3, "sidebar.team.black"),
   field_45160(4, "sidebar.team.dark_blue"),
   field_45161(5, "sidebar.team.dark_green"),
   field_45162(6, "sidebar.team.dark_aqua"),
   field_45163(7, "sidebar.team.dark_red"),
   field_45164(8, "sidebar.team.dark_purple"),
   field_45165(9, "sidebar.team.gold"),
   field_45166(10, "sidebar.team.gray"),
   field_45167(11, "sidebar.team.dark_gray"),
   field_45168(12, "sidebar.team.blue"),
   field_45169(13, "sidebar.team.green"),
   field_45170(14, "sidebar.team.aqua"),
   field_45171(15, "sidebar.team.red"),
   field_45172(16, "sidebar.team.light_purple"),
   field_45173(17, "sidebar.team.yellow"),
   field_45174(18, "sidebar.team.white");

   public static final class05031<class01890> field_45175 = class05033.N(class01890::values);
   public static final IntFunction<class01890> field_45176 = class02121.N(class01890::N, values(), class02126.field_41664);
   private final int field_45177;
   private final String field_45178;

   private class01890(int var3, String var4) {
      this.field_45177 = var3;
      this.field_45178 = var4;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static class01890 N(class06541 var0) {
      return switch (var0) {
         case field_1074 -> field_45159;
         case field_1058 -> field_45160;
         case field_1077 -> field_45161;
         case field_1062 -> field_45162;
         case field_1079 -> field_45163;
         case field_1064 -> field_45164;
         case field_1065 -> field_45165;
         case field_1080 -> field_45166;
         case field_1063 -> field_45167;
         case field_1078 -> field_45168;
         case field_1060 -> field_45169;
         case field_1075 -> field_45170;
         case field_1061 -> field_45171;
         case field_1076 -> field_45172;
         case field_1054 -> field_45173;
         case field_1068 -> field_45174;
         case field_1067, field_1056, field_1073, field_1070, field_1051, field_1055 -> null;
      };
   }

   public int N() {
      return this.field_45177;
   }

   @Override
   public String method_15434() {
      return this.field_45178;
   }
}
