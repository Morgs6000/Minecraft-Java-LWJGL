package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.lwjgl.opengl.GL20;

public class Shader {
    public void load() throws IOException {
        String vertexShaderSource = Files.readString(Paths.get("shaders/shader.vert"));

        int vertexShader;
        vertexShader = GL20.glCreateShader(GL20.GL_VERTEX_SHADER);

        GL20.glShaderSource(vertexShader, vertexShaderSource);
        GL20.glCompileShader(vertexShader);

        int success;
        String infoLog;
        GL20.glGetShaderiv(vertexShader, GL20.GL_COMPILE_STATUS, success);
    }
}
