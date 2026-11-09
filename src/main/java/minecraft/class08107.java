package minecraft;

import java.util.Objects;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;

public final class class08107<S> implements ModelStorage {
   private class01423 pose;
   private class06271<? super S> model;
   private S state;
   private int lightCoords;
   private int overlayCoords;
   private int tintedColor;
   @Nullable
   private class08388 sprite;
   private int outlineColor;
   @Nullable
   private class08141 crumblingOverlay;
   private int z;
   private int U;
   private int E;
   private boolean W;

   public S L() {
      return this.state;
   }

   @Nullable
   public class08388 M() {
      return this.sprite;
   }

   public void iris$capture() {
      this.z = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
      this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
      this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
      this.W = ImmediateState.isRenderingBEs;
   }

   public class08107(
      class01423 var1, class06271<? super S> var2, S var3, int var4, int var5, int var6, @Nullable class08388 var7, int var8, @Nullable class08141 var9
   ) {
      super();
      this.pose = var1;
      this.model = var2;
      this.state = (S)var3;
      this.lightCoords = var4;
      this.overlayCoords = var5;
      this.tintedColor = var6;
      this.sprite = var7;
      this.outlineColor = var8;
      this.crumblingOverlay = var9;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class08107
            && Objects.equals(this.pose, ((class08107)var1).pose)
            && Objects.equals(this.model, ((class08107)var1).model)
            && Objects.equals(this.state, ((class08107)var1).state)
            && this.lightCoords == ((class08107)var1).lightCoords
            && this.overlayCoords == ((class08107)var1).overlayCoords
            && this.tintedColor == ((class08107)var1).tintedColor
            && Objects.equals(this.sprite, ((class08107)var1).sprite)
            && this.outlineColor == ((class08107)var1).outlineColor
            && Objects.equals(this.crumblingOverlay, ((class08107)var1).crumblingOverlay);
   }

   @Override
   public final String toString() {
      return "class08107[pose="
         + Objects.toString(this.pose)
         + ", model="
         + Objects.toString(this.model)
         + ", state="
         + Objects.toString(this.state)
         + ", lightCoords="
         + Integer.toString(this.lightCoords)
         + ", overlayCoords="
         + Integer.toString(this.overlayCoords)
         + ", tintedColor="
         + Integer.toString(this.tintedColor)
         + ", sprite="
         + Objects.toString(this.sprite)
         + ", outlineColor="
         + Integer.toString(this.outlineColor)
         + ", crumblingOverlay="
         + Objects.toString(this.crumblingOverlay)
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
                                                            ((0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.model)) * 31
                                                               + Objects.hashCode(this.state)
                                                         )
                                                         * 31
                                                      + Integer.hashCode(this.lightCoords)
                                                )
                                                * 31
                                             + Integer.hashCode(this.overlayCoords)
                                       )
                                       * 31
                                    + Integer.hashCode(this.tintedColor)
                              )
                              * 31
                           + Objects.hashCode(this.sprite)
                     )
                     * 31
                  + Integer.hashCode(this.outlineColor)
            )
            * 31
         + Objects.hashCode(this.crumblingOverlay);
   }

   public int B() {
      return this.outlineColor;
   }

   @Nullable
   public class08141 Z() {
      return this.crumblingOverlay;
   }

   public int i() {
      return this.overlayCoords;
   }

   public int u() {
      return this.lightCoords;
   }

   public class06271<? super S> y() {
      return this.model;
   }

   public class01423 N() {
      return this.pose;
   }

   public int R() {
      return this.tintedColor;
   }

   public void iris$set() {
      CapturedRenderingState.INSTANCE.setCurrentEntity(this.z);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(this.U);
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(this.E);
   }

   public boolean iris$wasBE() {
      return this.W;
   }
}
