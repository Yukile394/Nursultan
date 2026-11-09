package minecraft;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Vector3i;
import org.jspecify.annotations.Nullable;

public enum class01372 implements class05033 {
   field_23292("identity", class05285.field_23362, false, false, false),
   field_23299("rot_180_face_xy", class05285.field_23362, true, true, false),
   field_23300("rot_180_face_xz", class05285.field_23362, true, false, true),
   field_23301("rot_180_face_yz", class05285.field_23362, false, true, true),
   field_23302("rot_120_nnn", class05285.field_23365, false, false, false),
   field_23303("rot_120_nnp", class05285.field_23366, true, false, true),
   field_23304("rot_120_npn", class05285.field_23366, false, true, true),
   field_23305("rot_120_npp", class05285.field_23365, true, false, true),
   field_23306("rot_120_pnn", class05285.field_23366, true, true, false),
   field_23307("rot_120_pnp", class05285.field_23365, true, true, false),
   field_23308("rot_120_ppn", class05285.field_23365, false, true, true),
   field_23309("rot_120_ppp", class05285.field_23366, false, false, false),
   field_23310("rot_180_edge_xy_neg", class05285.field_23363, true, true, true),
   field_23311("rot_180_edge_xy_pos", class05285.field_23363, false, false, true),
   field_23312("rot_180_edge_xz_neg", class05285.field_23367, true, true, true),
   field_23313("rot_180_edge_xz_pos", class05285.field_23367, false, true, false),
   field_23314("rot_180_edge_yz_neg", class05285.field_23364, true, true, true),
   field_23315("rot_180_edge_yz_pos", class05285.field_23364, true, false, false),
   field_23316("rot_90_x_neg", class05285.field_23364, false, false, true),
   field_23317("rot_90_x_pos", class05285.field_23364, false, true, false),
   field_23318("rot_90_y_neg", class05285.field_23367, true, false, false),
   field_23319("rot_90_y_pos", class05285.field_23367, false, false, true),
   field_23320("rot_90_z_neg", class05285.field_23363, false, true, false),
   field_23321("rot_90_z_pos", class05285.field_23363, true, false, false),
   field_23322("inversion", class05285.field_23362, true, true, true),
   field_23323("invert_x", class05285.field_23362, true, false, false),
   field_23266("invert_y", class05285.field_23362, false, true, false),
   field_23267("invert_z", class05285.field_23362, false, false, true),
   field_23268("rot_60_ref_nnn", class05285.field_23366, true, true, true),
   field_23269("rot_60_ref_nnp", class05285.field_23365, true, false, false),
   field_23270("rot_60_ref_npn", class05285.field_23365, false, false, true),
   field_23271("rot_60_ref_npp", class05285.field_23366, false, false, true),
   field_23272("rot_60_ref_pnn", class05285.field_23365, false, true, false),
   field_23273("rot_60_ref_pnp", class05285.field_23366, true, false, false),
   field_23274("rot_60_ref_ppn", class05285.field_23366, false, true, false),
   field_23275("rot_60_ref_ppp", class05285.field_23365, true, true, true),
   field_23276("swap_xy", class05285.field_23363, false, false, false),
   field_23277("swap_yz", class05285.field_23364, false, false, false),
   field_23278("swap_xz", class05285.field_23367, false, false, false),
   field_23279("swap_neg_xy", class05285.field_23363, true, true, false),
   field_23280("swap_neg_yz", class05285.field_23364, false, true, true),
   field_23281("swap_neg_xz", class05285.field_23367, true, false, true),
   field_23282("rot_90_ref_x_neg", class05285.field_23364, true, false, true),
   field_23283("rot_90_ref_x_pos", class05285.field_23364, true, true, false),
   field_23284("rot_90_ref_y_neg", class05285.field_23367, true, true, false),
   field_23285("rot_90_ref_y_pos", class05285.field_23367, false, true, true),
   field_23286("rot_90_ref_z_neg", class05285.field_23363, false, true, true),
   field_23287("rot_90_ref_z_pos", class05285.field_23363, true, false, true);

   public static final class01372 field_64506 = field_23317;
   public static final class01372 field_64507 = field_23301;
   public static final class01372 field_64508 = field_23316;
   public static final class01372 field_64509 = field_23319;
   public static final class01372 field_64510 = field_23300;
   public static final class01372 field_64511 = field_23318;
   public static final class01372 field_64512 = field_23321;
   public static final class01372 field_64513 = field_23299;
   public static final class01372 field_64514 = field_23320;
   private final Matrix3fc field_23288;
   private final String field_23289;
   @Nullable
   private Map<class07211, class07211> field_23290;
   private final boolean field_23291;
   private final boolean field_23293;
   private final boolean field_23294;
   private final class05285 field_23295;
   private static final class01372[][] field_56956 = class07536.N(() -> {
      class01372[] aclass01372 = values();
      class01372[][] aclass013721 = new class01372[aclass01372.length][aclass01372.length];
      Map map = Arrays.stream(aclass01372).collect(Collectors.toMap(class01372::u, var0x -> var0x));

      for (class01372 class01372x : aclass01372) {
         for (class01372 class01372x : aclass01372) {
            class05285 class05285 = class01372x.field_23295.N(class01372x.field_23295);
            boolean flag = class01372x.N(class07185.field_11048) ^ class01372x.N(class01372x.field_23295.N(class07185.field_11048));
            boolean flag1 = class01372x.N(class07185.field_11052) ^ class01372x.N(class01372x.field_23295.N(class07185.field_11052));
            boolean flag2 = class01372x.N(class07185.field_11051) ^ class01372x.N(class01372x.field_23295.N(class07185.field_11051));
            aclass013721[class01372x.ordinal()][class01372x.ordinal()] = (class01372)map.get(N(flag, flag1, flag2, class05285));
         }
      }

      return aclass013721;
   });
   private static final class01372[] field_56957 = Arrays.stream(values())
      .map(var0 -> Arrays.stream(values()).filter(var1 -> var0.N(var1) == field_23292).findAny().get())
      .toArray(class01372[]::new);

   public class05285 L() {
      return this.field_23295;
   }

   private class01372(String var3, class05285 var4, boolean var5, boolean var6, boolean var7) {
      this.field_23289 = var3;
      this.field_23291 = var5;
      this.field_23293 = var6;
      this.field_23294 = var7;
      this.field_23295 = var4;
      this.field_23288 = new Matrix3f().scaling(var5 ? -1.0F : 1.0F, var6 ? -1.0F : 1.0F, var7 ? -1.0F : 1.0F).mul(var4.y());
   }

   @Override
   public String toString() {
      return this.field_23289;
   }

   private int u() {
      return N(this.field_23291, this.field_23293, this.field_23294, this.field_23295);
   }

   public Matrix3fc y() {
      return this.field_23288;
   }

   public Vector3i N(Vector3i var1) {
      this.field_23295.N(var1);
      var1.x = var1.x * (this.field_23291 ? -1 : 1);
      var1.y = var1.y * (this.field_23293 ? -1 : 1);
      var1.z = var1.z * (this.field_23294 ? -1 : 1);
      return var1;
   }

   public class01372 N(class01372 var1) {
      return field_56956[this.ordinal()][var1.ordinal()];
   }

   public class01372 N() {
      return field_56957[this.ordinal()];
   }

   public class07211 N(class07211 var1) {
      if (this.field_23290 == null) {
         this.field_23290 = class07536.N_74(class07211.class, var1x -> {
            class07185 class07185x = var1x.z();
            class07212 class07212x = var1x.i();
            class07185 class07185x = this.field_23295.N().N(class07185x);
            class07212 class07212x = this.N(class07185x) ? class07212x.L() : class07212x;
            return class07211.N(class07185x, class07212x);
         });
      }

      return this.field_23290.get(var1);
   }

   public class05288 N(class05288 var1) {
      return class05288.N(this.N(var1.N()), this.N(var1.y()));
   }

   private static int N(boolean var0, boolean var1, boolean var2, class05285 var3) {
      int i = (var2 ? 4 : 0) + (var1 ? 2 : 0) + (var0 ? 1 : 0);
      return var3.ordinal() << 3 | i;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean N(class07185 var1) {
      return switch (var1) {
         case field_11048 -> this.field_23291;
         case field_11052 -> this.field_23293;
         case field_11051 -> this.field_23294;
      };
   }

   @Override
   public String method_15434() {
      return this.field_23289;
   }
}
