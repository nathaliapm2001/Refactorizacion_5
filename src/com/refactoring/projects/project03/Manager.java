package com.refactoring.projects.project03;

public class Manager {
	
    private static final int MESES_DEL_ANIO = 12;
	private static final int BONO_POR_EMPLEADO = 1000;
	private String nombre;
    private double salario;
    private String departamento; 
    private int empleadosACargo;
    
    public double calcularSalarioAnual() {
        return getSalario() * MESES_DEL_ANIO + calcularBono();
    }

	private int calcularBono() {
		return getEmpleadosACargo() * BONO_POR_EMPLEADO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getEmpleadosACargo() {
		return empleadosACargo;
	}

	public void setEmpleadosACargo(int empleadosACargo) {
		this.empleadosACargo = empleadosACargo;
	}


}

