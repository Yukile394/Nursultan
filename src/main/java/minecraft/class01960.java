package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record class01960(
   String name,
   boolean canOpenByHand,
   boolean canOpenByWindCharge,
   boolean canButtonBeActivatedByArrows,
   class01963 pressurePlateSensitivity,
   class07752 soundType,
   class04891 doorClose,
   class04891 doorOpen,
   class04891 trapdoorClose,
   class04891 trapdoorOpen,
   class04891 pressurePlateClickOff,
   class04891 pressurePlateClickOn,
   class04891 buttonClickOff,
   class04891 buttonClickOn
) {
   private static final Map<String, class01960> J = new Object2ObjectArrayMap();
   public static final Codec<class01960> N = Codec.stringResolver(class01960::y, J::get);
   public static final class01960 y = N(
      new class01960(
         "iron",
         false,
         false,
         false,
         class01963.field_11361,
         class07752.yb,
         class04909.sT,
         class04909.sb,
         class04909.sd,
         class04909.sw,
         class04909.Tx,
         class04909.TD,
         class04909.QG,
         class04909.Ql
      )
   );
   public static final class01960 L = N(
      new class01960(
         "copper",
         true,
         true,
         false,
         class01963.field_11361,
         class07752.Nz,
         class04909.Mn,
         class04909.Mt,
         class04909.Mr,
         class04909.BN,
         class04909.Tx,
         class04909.TD,
         class04909.QG,
         class04909.Ql
      )
   );
   public static final class01960 u = N(
      new class01960(
         "gold",
         false,
         true,
         false,
         class01963.field_11361,
         class07752.M,
         class04909.sT,
         class04909.sb,
         class04909.sd,
         class04909.sw,
         class04909.Tx,
         class04909.TD,
         class04909.QG,
         class04909.Ql
      )
   );
   public static final class01960 i = N(
      new class01960(
         "stone",
         true,
         true,
         false,
         class01963.field_11362,
         class07752.R,
         class04909.sT,
         class04909.sb,
         class04909.sd,
         class04909.sw,
         class04909.QY,
         class04909.QQ,
         class04909.QG,
         class04909.Ql
      )
   );
   public static final class01960 R = N(
      new class01960(
         "polished_blackstone",
         true,
         true,
         false,
         class01963.field_11362,
         class07752.R,
         class04909.sT,
         class04909.sb,
         class04909.sd,
         class04909.sw,
         class04909.QY,
         class04909.QQ,
         class04909.QG,
         class04909.Ql
      )
   );
   public static final class01960 M = N(new class01960("oak"));
   public static final class01960 B = N(new class01960("spruce"));
   public static final class01960 Z = N(new class01960("birch"));
   public static final class01960 z = N(new class01960("acacia"));
   public static final class01960 U = N(
      new class01960(
         "cherry",
         true,
         true,
         true,
         class01963.field_11361,
         class07752.ND,
         class04909.RR,
         class04909.RM,
         class04909.RB,
         class04909.RZ,
         class04909.RE,
         class04909.RW,
         class04909.Rz,
         class04909.RU
      )
   );
   public static final class01960 E = N(new class01960("jungle"));
   public static final class01960 W = N(new class01960("dark_oak"));
   public static final class01960 m = N(new class01960("pale_oak"));
   public static final class01960 P = N(
      new class01960(
         "crimson",
         true,
         true,
         true,
         class01963.field_11361,
         class07752.Nx,
         class04909.vT,
         class04909.vb,
         class04909.vj,
         class04909.vv,
         class04909.vG,
         class04909.vl,
         class04909.vn,
         class04909.vt
      )
   );
   public static final class01960 s = N(
      new class01960(
         "warped",
         true,
         true,
         true,
         class01963.field_11361,
         class07752.Nx,
         class04909.vT,
         class04909.vb,
         class04909.vj,
         class04909.vv,
         class04909.vG,
         class04909.vl,
         class04909.vn,
         class04909.vt
      )
   );
   public static final class01960 T = N(new class01960("mangrove"));
   public static final class01960 b = N(
      new class01960(
         "bamboo",
         true,
         true,
         true,
         class01963.field_11361,
         class07752.NS,
         class04909.yk,
         class04909.yY,
         class04909.yQ,
         class04909.yO,
         class04909.yJ,
         class04909.yo,
         class04909.yg,
         class04909.yI
      )
   );

   public boolean L() {
      return this.canOpenByHand;
   }

   public class07752 M() {
      return this.soundType;
   }

   public class04891 P() {
      return this.buttonClickOn;
   }

   public class01960(String var1) {
      this(
         var1,
         true,
         true,
         true,
         class01963.field_11361,
         class07752.y,
         class04909.Jz,
         class04909.JU,
         class04909.JE,
         class04909.JW,
         class04909.Js,
         class04909.JT,
         class04909.Jm,
         class04909.JP
      );
   }

   public class01960(
      String name,
      boolean canOpenByHand,
      boolean canOpenByWindCharge,
      boolean canButtonBeActivatedByArrows,
      class01963 pressurePlateSensitivity,
      class07752 soundType,
      class04891 doorClose,
      class04891 doorOpen,
      class04891 trapdoorClose,
      class04891 trapdoorOpen,
      class04891 pressurePlateClickOff,
      class04891 pressurePlateClickOn,
      class04891 buttonClickOff,
      class04891 buttonClickOn
   ) {
      super();
      this.name = name;
      this.canOpenByHand = canOpenByHand;
      this.canOpenByWindCharge = canOpenByWindCharge;
      this.canButtonBeActivatedByArrows = canButtonBeActivatedByArrows;
      this.pressurePlateSensitivity = pressurePlateSensitivity;
      this.soundType = soundType;
      this.doorClose = doorClose;
      this.doorOpen = doorOpen;
      this.trapdoorClose = trapdoorClose;
      this.trapdoorOpen = trapdoorOpen;
      this.pressurePlateClickOff = pressurePlateClickOff;
      this.pressurePlateClickOn = pressurePlateClickOn;
      this.buttonClickOff = buttonClickOff;
      this.buttonClickOn = buttonClickOn;
   }

   public class04891 B() {
      return this.doorClose;
   }

   public class04891 Z() {
      return this.doorOpen;
   }

   public boolean i() {
      return this.canButtonBeActivatedByArrows;
   }

   public class04891 m() {
      return this.buttonClickOff;
   }

   public class04891 U() {
      return this.trapdoorOpen;
   }

   public class04891 z() {
      return this.trapdoorClose;
   }

   public boolean u() {
      return this.canOpenByWindCharge;
   }

   public String y() {
      return this.name;
   }

   public class04891 E() {
      return this.pressurePlateClickOff;
   }

   public static class01960 N(class01960 var0) {
      J.put(var0.name, var0);
      return var0;
   }

   public static Stream<class01960> N() {
      return J.values().stream();
   }

   public class04891 W() {
      return this.pressurePlateClickOn;
   }

   public class01963 R() {
      return this.pressurePlateSensitivity;
   }
}
