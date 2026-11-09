package minecraft;

import java.util.Objects;
import net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFlags;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class02022 implements BakedQuadView {
   private Vector3fc position0;
   private Vector3fc position1;
   private Vector3fc position2;
   private Vector3fc position3;
   private long packedUV0;
   private long packedUV1;
   private long packedUV2;
   private long packedUV3;
   private int tintIndex;
   private class07211 direction;
   private class08388 sprite;
   private boolean shade;
   private int lightEmission;
   public static final int N = 4;
   private int P;
   private int s;
   private ModelQuadFacing T = null;

   public Vector3fc L() {
      return this.position1;
   }

   public int getFlags() {
      return this.P;
   }

   public long M() {
      return this.packedUV1;
   }

   public int getLight(int var1) {
      return 0;
   }

   public class02022(
      Vector3fc var1,
      Vector3fc var2,
      Vector3fc var3,
      Vector3fc var4,
      long var5,
      long var7,
      long var9,
      long var11,
      int var13,
      class07211 var14,
      class08388 var15,
      boolean var16,
      int var17
   ) {
      super();
      this.position0 = var1;
      this.position1 = var2;
      this.position2 = var3;
      this.position3 = var4;
      this.packedUV0 = var5;
      this.packedUV1 = var7;
      this.packedUV2 = var9;
      this.packedUV3 = var11;
      this.tintIndex = var13;
      this.direction = var14;
      this.sprite = var15;
      this.shade = var16;
      this.lightEmission = var17;
      this.N(var1, var2, var3, var4, var5, var7, var9, var11, var13, var14, var15, var16, var17, null);
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class02022
            && Objects.equals(this.position0, ((class02022)var1).position0)
            && Objects.equals(this.position1, ((class02022)var1).position1)
            && Objects.equals(this.position2, ((class02022)var1).position2)
            && Objects.equals(this.position3, ((class02022)var1).position3)
            && this.packedUV0 == ((class02022)var1).packedUV0
            && this.packedUV1 == ((class02022)var1).packedUV1
            && this.packedUV2 == ((class02022)var1).packedUV2
            && this.packedUV3 == ((class02022)var1).packedUV3
            && this.tintIndex == ((class02022)var1).tintIndex
            && Objects.equals(this.direction, ((class02022)var1).direction)
            && Objects.equals(this.sprite, ((class02022)var1).sprite)
            && this.shade == ((class02022)var1).shade
            && this.lightEmission == ((class02022)var1).lightEmission;
   }

   @Override
   public final String toString() {
      return "class02022[position0="
         + Objects.toString(this.position0)
         + ", position1="
         + Objects.toString(this.position1)
         + ", position2="
         + Objects.toString(this.position2)
         + ", position3="
         + Objects.toString(this.position3)
         + ", packedUV0="
         + Long.toString(this.packedUV0)
         + ", packedUV1="
         + Long.toString(this.packedUV1)
         + ", packedUV2="
         + Long.toString(this.packedUV2)
         + ", packedUV3="
         + Long.toString(this.packedUV3)
         + ", tintIndex="
         + Integer.toString(this.tintIndex)
         + ", direction="
         + Objects.toString(this.direction)
         + ", sprite="
         + Objects.toString(this.sprite)
         + ", shade="
         + Boolean.toString(this.shade)
         + ", lightEmission="
         + Integer.toString(this.lightEmission)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (0 * 31 + Objects.hashCode(this.position0)) * 31
                                                                                                            + Objects.hashCode(this.position1)
                                                                                                      )
                                                                                                      * 31
                                                                                                   + Objects.hashCode(this.position2)
                                                                                             )
                                                                                             * 31
                                                                                          + Objects.hashCode(this.position3)
                                                                                    )
                                                                                    * 31
                                                                                 + Long.hashCode(this.packedUV0)
                                                                           )
                                                                           * 31
                                                                        + Long.hashCode(this.packedUV1)
                                                                  )
                                                                  * 31
                                                               + Long.hashCode(this.packedUV2)
                                                         )
                                                         * 31
                                                      + Long.hashCode(this.packedUV3)
                                                )
                                                * 31
                                             + Integer.hashCode(this.tintIndex)
                                       )
                                       * 31
                                    + Objects.hashCode(this.direction)
                              )
                              * 31
                           + Objects.hashCode(this.sprite)
                     )
                     * 31
                  + Boolean.hashCode(this.shade)
            )
            * 31
         + Integer.hashCode(this.lightEmission);
   }

   public long B() {
      return this.packedUV2;
   }

   public long Z() {
      return this.packedUV3;
   }

   public Vector3fc i() {
      return this.position3;
   }

   public int m() {
      return this.lightEmission;
   }

   public class07211 U() {
      return this.direction;
   }

   public int z() {
      return this.tintIndex;
   }

   public Vector3fc u() {
      return this.position2;
   }

   public long y(int var1) {
      return switch (var1) {
         case 0 -> this.packedUV0;
         case 1 -> this.packedUV1;
         case 2 -> this.packedUV2;
         case 3 -> this.packedUV3;
         default -> throw new IndexOutOfBoundsException(var1);
      };
   }

   public Vector3fc y() {
      return this.position0;
   }

   public class08388 E() {
      return this.sprite;
   }

   private void N(
      Vector3fc var1,
      Vector3fc var2,
      Vector3fc var3,
      Vector3fc var4,
      long var5,
      long var7,
      long var9,
      long var11,
      int var13,
      class07211 var14,
      class08388 var15,
      boolean var16,
      int var17,
      CallbackInfo var18
   ) {
      this.s = this.calculateNormal();
      this.T = ModelQuadFacing.fromPackedNormal(this.s);
      this.P = ModelQuadFlags.getQuadFlags(this, var14);
   }

   public boolean N() {
      return this.tintIndex != -1;
   }

   public Vector3fc N(int var1) {
      return switch (var1) {
         case 0 -> this.position0;
         case 1 -> this.position1;
         case 2 -> this.position2;
         case 3 -> this.position3;
         default -> throw new IndexOutOfBoundsException(var1);
      };
   }

   public float getY(int var1) {
      return this.N(var1).y();
   }

   public float getX(int var1) {
      return this.N(var1).x();
   }

   public float getZ(int var1) {
      return this.N(var1).z();
   }

   public boolean W() {
      return this.shade;
   }

   public long R() {
      return this.packedUV0;
   }

   public int getColor(int var1) {
      return -1;
   }

   public boolean hasAO() {
      return true;
   }

   public float getTexU(int var1) {
      return class04809.N(this.y(var1));
   }

   public boolean hasShade() {
      return this.shade;
   }

   public float getTexV(int var1) {
      return class04809.y(this.y(var1));
   }

   public class08388 getSprite() {
      return this.sprite;
   }

   public int getVertexNormal(int var1) {
      return 0;
   }

   public int getMaxLightQuad(int var1) {
      return class03042.y(this.getLight(var1), this.m());
   }

   public int getFaceNormal() {
      return this.s;
   }

   public class07211 getLightFace() {
      return this.direction;
   }

   public ModelQuadFacing getNormalFace() {
      return this.T;
   }

   public int getTintIndex() {
      return this.tintIndex;
   }
}
