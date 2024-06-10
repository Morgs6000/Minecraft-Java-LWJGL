package src;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL20.*;

public class Shader {
    public void load() {
        String vertexShaderSource = "shaders.shader.vert";
        
        int vertexShader;
        vertexShader = glCreateShader(GL_VERTEX_SHADER);

        glShaderSource(vertexShader, vertexShaderSource);
        glCompileShader(vertexShader);

        int success;
        String infoLog;
        glGetShaderi(vertexShader, GL_COMPILE_STATUS);

        if(!success) {
            glGetShaderInfoLog(vertexShader, 512, NULL, infoLog);
            System.err.println("ERROR::SHADER::VERTEX::COMPILATION_FAILED\n" + infoLog);
        }
    }
}
