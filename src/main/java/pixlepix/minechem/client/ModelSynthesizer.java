// Date: 20/12/2012 16:26:24
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixlepix.minechem.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.jetbrains.annotations.NotNull;
import pixlepix.minechem.common.utils.MinechemHelper;

public class ModelSynthesizer extends ModelBase {
	// fields
	ModelRenderer base;
	ModelRenderer back;
	ModelRenderer topframeleft;
	ModelRenderer topframefront;
	ModelRenderer topframeright;
	ModelRenderer dish1;
	ModelRenderer dish2;
	ModelRenderer dish3;
	ModelRenderer toparm;
	ModelRenderer bottomarm;
	ModelRenderer leftpanel;
	ModelRenderer rightpanel;
	ModelRenderer backpanel;
	ModelRenderer backbox;
	ModelRenderer toppanel;
	ModelRenderer paneljoint;

	float animationTimer = 0;

	public ModelSynthesizer() {
		textureWidth = 128;
		textureHeight = 64;

		base = new ModelRenderer(this, 0, 46);
		base.addBox(0F, 0F, 0F, 16, 2, 16);
		base.setRotationPoint(-8F, 22F, -8F);
		base.setTextureSize(128, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		back = new ModelRenderer(this, 0, 32);
		back.addBox(0F, -1F, 0F, 14, 9, 5);
		back.setRotationPoint(-7F, 14F, 2F);
		back.setTextureSize(128, 64);
		back.mirror = true;
		setRotation(back, 0F, 0F, 0F);
		topframeleft = new ModelRenderer(this, 38, 21);
		topframeleft.addBox(0F, 0F, 0F, 1, 1, 9);
		topframeleft.setRotationPoint(-7F, 13F, -7F);
		topframeleft.setTextureSize(128, 64);
		topframeleft.mirror = true;
		setRotation(topframeleft, 0F, 0F, 0F);
		topframefront = new ModelRenderer(this, 38, 38);
		topframefront.addBox(0F, 0F, 0F, 12, 1, 1);
		topframefront.setRotationPoint(-6F, 13F, -7F);
		topframefront.setTextureSize(128, 64);
		topframefront.mirror = true;
		setRotation(topframefront, 0F, 0F, 0F);
		topframeright = new ModelRenderer(this, 38, 21);
		topframeright.addBox(0F, 0F, 0F, 1, 1, 9);
		topframeright.setRotationPoint(6F, 13F, -7F);
		topframeright.setTextureSize(128, 64);
		topframeright.mirror = true;
		setRotation(topframeright, 0F, 0F, 0F);
		dish1 = new ModelRenderer(this, 0, 0);
		dish1.addBox(0F, 0F, 0F, 3, 1, 3);
		dish1.setRotationPoint(-6F, 21F, -6F);
		dish1.setTextureSize(128, 64);
		dish1.mirror = true;
		setRotation(dish1, 0F, 0F, 0F);
		dish2 = new ModelRenderer(this, 0, 4);
		dish2.addBox(0F, 0F, 0F, 3, 1, 3);
		dish2.setRotationPoint(-1.5F, 21F, -6F);
		dish2.setTextureSize(128, 64);
		dish2.mirror = true;
		setRotation(dish2, 0F, 0F, 0F);
		dish3 = new ModelRenderer(this, 0, 8);
		dish3.addBox(0F, 0F, 0F, 3, 1, 3);
		dish3.setRotationPoint(3F, 21F, -6F);
		dish3.setTextureSize(128, 64);
		dish3.mirror = true;
		setRotation(dish3, 0F, 0F, 0F);
		toparm = new ModelRenderer(this, 0, 17);
		toparm.addBox(0F, 0F, 0F, 3, 2, 13);
		toparm.setRotationPoint(-6F, 11F, -8F);
		toparm.setTextureSize(128, 64);
		toparm.mirror = true;
		setRotation(toparm, 0F, 0F, 0F);
		bottomarm = new ModelRenderer(this, 32, 23);
		bottomarm.addBox(1F, 0F, 0F, 1, 8, 1);
		bottomarm.setRotationPoint(-6F, 13F, -5F);
		bottomarm.setTextureSize(128, 64);
		bottomarm.mirror = true;
		setRotation(bottomarm, 0F, 0F, 0F);
		leftpanel = new ModelRenderer(this, 64, 23);
		leftpanel.addBox(0F, 0F, 0F, 1, 8, 8);
		leftpanel.setRotationPoint(-8F, 12F, -4F);
		leftpanel.setTextureSize(128, 64);
		leftpanel.mirror = true;
		setRotation(leftpanel, 0F, 0F, 0F);
		rightpanel = new ModelRenderer(this, 64, 39);
		rightpanel.addBox(0F, 0F, 0F, 1, 8, 8);
		rightpanel.setRotationPoint(7F, 12F, -4F);
		rightpanel.setTextureSize(128, 64);
		rightpanel.mirror = true;
		setRotation(rightpanel, 0F, 0F, 0F);
		backpanel = new ModelRenderer(this, 64, 14);
		backpanel.addBox(0F, 0F, 0F, 8, 8, 1);
		backpanel.setRotationPoint(-4F, 12F, 7F);
		backpanel.setTextureSize(128, 64);
		backpanel.mirror = true;
		setRotation(backpanel, 0F, 0F, 0F);
		backbox = new ModelRenderer(this, 38, 40);
		backbox.addBox(0F, 0F, 0F, 10, 3, 3);
		backbox.setRotationPoint(-5F, 19F, -1F);
		backbox.setTextureSize(128, 64);
		backbox.mirror = true;
		setRotation(backbox, 0F, 0F, 0F);
		toppanel = new ModelRenderer(this, 64, 55);
		toppanel.addBox(0F, 0F, 0F, 8, 1, 8);
		toppanel.setRotationPoint(-4F, 8F, -4F);
		toppanel.setTextureSize(128, 64);
		toppanel.mirror = true;
		setRotation(toppanel, 0F, 0F, 0F);
		paneljoint = new ModelRenderer(this, 38, 31);
		paneljoint.addBox(0F, 0F, 0F, 4, 1, 6);
		paneljoint.setRotationPoint(-2F, 8F, 4F);
		paneljoint.setTextureSize(128, 64);
		paneljoint.mirror = true;
		setRotation(paneljoint, -0.8551081F, 0F, 0F);
	}

	public void render(float scale) {
		base.render(scale);
		back.render(scale);
		topframeleft.render(scale);
		topframefront.render(scale);
		topframeright.render(scale);
		dish1.render(scale);
		dish2.render(scale);
		dish3.render(scale);
		toparm.render(scale);
		bottomarm.render(scale);
		leftpanel.render(scale);
		rightpanel.render(scale);
		backpanel.render(scale);
		backbox.render(scale);
		toppanel.render(scale);
		paneljoint.render(scale);
	}

	private void armHorizontal(float timer, float start, float end, float xStart, float xEnd) {
		if (timer > start && timer <= end) {
			float time = end - start;
			float horizontalTimer = timer - start;
			float newX = MinechemHelper.translateValue(horizontalTimer, 0.0F, time, xStart, xEnd);
			toparm.rotationPointX = newX;
			bottomarm.rotationPointX = newX;
		}
	}

	private void armVertical(float timer, float start, float end, float yStart, float yEnd) {
		if (timer > start && timer <= end) {
			float time = end - start;
			float verticalTimer = timer - start;
			float newY = MinechemHelper.translateValue(verticalTimer, 0.0F, time, yStart, yEnd);
			bottomarm.rotationPointY = newY;
		}
	}

	public void updateArm() {
		animationTimer += 0.5F;
		// ARM UP
		armVertical(animationTimer, 0, 10, 13, 11.2F);
		// ARM RIGHT (middle)
		armHorizontal(animationTimer, 10, 40, -6, -1.5F);
		// ARM DOWN
		armVertical(animationTimer, 40, 50, 11.2F, 13);
		// ARM UP
		armVertical(animationTimer, 50, 60, 13, 11.2F);
		// ARM RIGHT (right)
		armHorizontal(animationTimer, 60, 90, -1.5F, 3F);
		// ARM DOWN
		armVertical(animationTimer, 90, 100, 11.2F, 13);
		// ARM UP
		armVertical(animationTimer, 100, 110, 13, 11.2F);
		// ARM LEFT (middle)
		armHorizontal(animationTimer, 110, 140, 3F, -1.5F);
		// ARM DOWN
		armVertical(animationTimer, 140, 150, 11.2F, 13);
		// ARM UP
		armVertical(animationTimer, 150, 160, 13, 11.2F);
		// ARM LEFT (left)
		armHorizontal(animationTimer, 160, 190, -1.5F, -6F);
		// ARM DOWN
		armVertical(animationTimer, 190, 200, 11.2F, 13);
		// RESET TIMER
		if (animationTimer > 200) {
			animationTimer = 0;
		}
	}

	private void setRotation(@NotNull ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
