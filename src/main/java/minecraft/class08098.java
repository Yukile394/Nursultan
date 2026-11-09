package minecraft;

import java.util.Objects;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;

public final class class08098 implements ModelStorage {
   private class01423 pose;
   private class01686 modelPart;
   private int lightCoords;
   private int overlayCoords;
   @Nullable
   private class08388 sprite;
   private boolean sheeted;
   private boolean hasFoil;
   private int tintedColor;
   @Nullable
   private class08141 crumblingOverlay;
   private int outlineColor;
   private int U;
   private int E;
   private int W;
   private boolean m;

   public int L() {
      return this.lightCoords;
   }

   public boolean M() {
      return this.hasFoil;
   }

   public void iris$capture() {
      this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
      this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
      this.W = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
      this.m = ImmediateState.isRenderingBEs;
   }

   public class08098(
      class01423 var1,
      class01686 var2,
      int var3,
      int var4,
      @Nullable class08388 var5,
      boolean var6,
      boolean var7,
      int var8,
      @Nullable class08141 var9,
      int var10
   ) {
      super();
      this.pose = var1;
      this.modelPart = var2;
      this.lightCoords = var3;
      this.overlayCoords = var4;
      this.sprite = var5;
      this.sheeted = var6;
      this.hasFoil = var7;
      this.tintedColor = var8;
      this.crumblingOverlay = var9;
      this.outlineColor = var10;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class08098
            && Objects.equals(this.pose, ((class08098)var1).pose)
            && Objects.equals(this.modelPart, ((class08098)var1).modelPart)
            && this.lightCoords == ((class08098)var1).lightCoords
            && this.overlayCoords == ((class08098)var1).overlayCoords
            && Objects.equals(this.sprite, ((class08098)var1).sprite)
            && this.sheeted == ((class08098)var1).sheeted
            && this.hasFoil == ((class08098)var1).hasFoil
            && this.tintedColor == ((class08098)var1).tintedColor
            && Objects.equals(this.crumblingOverlay, ((class08098)var1).crumblingOverlay)
            && this.outlineColor == ((class08098)var1).outlineColor;
   }

   @Override
   public final String toString() {
      return "class08098[pose="
         + Objects.toString(this.pose)
         + ", modelPart="
         + Objects.toString(this.modelPart)
         + ", lightCoords="
         + Integer.toString(this.lightCoords)
         + ", overlayCoords="
         + Integer.toString(this.overlayCoords)
         + ", sprite="
         + Objects.toString(this.sprite)
         + ", sheeted="
         + Boolean.toString(this.sheeted)
         + ", hasFoil="
         + Boolean.toString(this.hasFoil)
         + ", tintedColor="
         + Integer.toString(this.tintedColor)
         + ", crumblingOverlay="
         + Objects.toString(this.crumblingOverlay)
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
                                                                     ((0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.modelPart)) * 31
                                                                        + Integer.hashCode(this.lightCoords)
                                                                  )
                                                                  * 31
                                                               + Integer.hashCode(this.overlayCoords)
                                                         )
                                                         * 31
                                                      + Objects.hashCode(this.sprite)
                                                )
                                                * 31
                                             + Boolean.hashCode(this.sheeted)
                                       )
                                       * 31
                                    + Boolean.hashCode(this.hasFoil)
                              )
                              * 31
                           + Integer.hashCode(this.tintedColor)
                     )
                     * 31
                  + Objects.hashCode(this.crumblingOverlay)
            )
            * 31
         + Integer.hashCode(this.outlineColor);
   }

   public int B() {
      return this.tintedColor;
   }

   @Nullable
   public class08141 Z() {
      return this.crumblingOverlay;
   }

   @Nullable
   public class08388 i() {
      return this.sprite;
   }

   public int z() {
      return this.outlineColor;
   }

   public int u() {
      return this.overlayCoords;
   }

   public class01686 y() {
      return this.modelPart;
   }

   public class01423 N() {
      return this.pose;
   }

   public boolean R() {
      return this.sheeted;
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
