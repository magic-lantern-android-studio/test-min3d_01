// Declare package.
package com.wizzerworks.min3d;

// Import Min3d classes.
import com.wizzer.mle.min3d.core.Object3dContainer;
import com.wizzer.mle.min3d.core.RendererActivity;
import com.wizzer.mle.min3d.primitives.Box;
import com.wizzer.mle.min3d.vos.Light;

/**
 * Minimal test for Wizzer Works fork of Min3d.
 *
 * @author Lee
 * @author Mark Millard
 */
public class TestMin3dActivity extends RendererActivity
{
    Object3dContainer m_cube;

    public void initScene()
    {
        /*
         * Add a light to the Scene.
         * The Scene must have light for Object3d's with normals
         * enabled (which is the default setting) to be visible.
         */
        scene.lights().add( new Light() );

        /*
         * Create an Object3d and add it to the scene.
         * In this case, we're creating a cube using the Box class, which extends Object3d.
         * Any Object3d must be declared with booleans that determine whether its vertices store:
         *     (a) U/V texture coordinates
         *     (b) Normals (required for shading based on light source/s)
         *     (c) Per-vertex color information
         * We're going to create a shaded cube without textures or colors, so for those arguments
         * we are using "false,true,false".
         */
        m_cube = new Box(1, 1, 1, null, false, true, false);

        /*
         * Since we're not using any colors on the cube, we're setting this to false.
         * (False is the default)
         */
        m_cube.colorMaterialEnabled(false);

        /*
         * Add cube to the scene.
         */
        scene.addChild(m_cube);
    }
}