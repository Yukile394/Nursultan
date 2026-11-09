package minecraft;

import java.util.Objects;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix4f;

public final class class08113 implements ModelStorage {
   private Matrix4f pose;
   private float x;
   private float y;
   private class01028 string;
   private boolean dropShadow;
   private class01583 displayMode;
   private int lightCoords;
   private int color;
   private int backgroundColor;
   private int outlineColor;
   private int U;
   private int E;
   private int W;
   private boolean m;

   public float L() {
      return this.y;
   }

   public int M() {
      return this.lightCoords;
   }

   public void iris$capture() {
      this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
      this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
      this.W = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
      this.m = ImmediateState.isRenderingBEs;
   }

   public class08113(Matrix4f var1, float var2, float var3, class01028 var4, boolean var5, class01583 var6, int var7, int var8, int var9, int var10) {
      super();
      this.pose = var1;
      this.x = var2;
      this.y = var3;
      this.string = var4;
      this.dropShadow = var5;
      this.displayMode = var6;
      this.lightCoords = var7;
      this.color = var8;
      this.backgroundColor = var9;
      this.outlineColor = var10;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class08113
            && Objects.equals(this.pose, ((class08113)var1).pose)
            && Float.compare(this.x, ((class08113)var1).x) == 0
            && Float.compare(this.y, ((class08113)var1).y) == 0
            && Objects.equals(this.string, ((class08113)var1).string)
            && this.dropShadow == ((class08113)var1).dropShadow
            && Objects.equals(this.displayMode, ((class08113)var1).displayMode)
            && this.lightCoords == ((class08113)var1).lightCoords
            && this.color == ((class08113)var1).color
            && this.backgroundColor == ((class08113)var1).backgroundColor
            && this.outlineColor == ((class08113)var1).outlineColor;
   }

   @Override
   public final String toString() {
      return "class08113[pose="
         + Objects.toString(this.pose)
         + ", x="
         + Float.toString(this.x)
         + ", y="
         + Float.toString(this.y)
         + ", string="
         + Objects.toString(this.string)
         + ", dropShadow="
         + Boolean.toString(this.dropShadow)
         + ", displayMode="
         + Objects.toString(this.displayMode)
         + ", lightCoords="
         + Integer.toString(this.lightCoords)
         + ", color="
         + Integer.toString(this.color)
         + ", backgroundColor="
         + Integer.toString(this.backgroundColor)
         + ", outlineColor="
         + Integer.toString(this.outlineColor)
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
                                                                     ((0 * 31 + Objects.hashCode(this.pose)) * 31 + Float.hashCode(this.x)) * 31
                                                                        + Float.hashCode(this.y)
                                                                  )
                                                                  * 31
                                                               + Objects.hashCode(this.string)
                                                         )
                                                         * 31
                                                      + Boolean.hashCode(this.dropShadow)
                                                )
                                                * 31
                                             + Objects.hashCode(this.displayMode)
                                       )
                                       * 31
                                    + Integer.hashCode(this.lightCoords)
                              )
                              * 31
                           + Integer.hashCode(this.color)
                     )
                     * 31
                  + Integer.hashCode(this.backgroundColor)
            )
            * 31
         + Integer.hashCode(this.outlineColor);
   }

   public int B() {
      return this.color;
   }

   public int Z() {
      return this.backgroundColor;
   }

   public boolean i() {
      return this.dropShadow;
   }

   public int z() {
      return this.outlineColor;
   }

   public class01028 u() {
      return this.string;
   }

   public float y() {
      return this.x;
   }

   public Matrix4f N() {
      return this.pose;
   }

   public class01583 R() {
      return this.displayMode;
   }

   public void iris$set() {
      CapturedRenderingState.INSTANCE.setCurrentEntity(this.U);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(this.E);
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(this.W);
   }

   public boolean iris$wasBE() {
      return this.m;
   }
}
