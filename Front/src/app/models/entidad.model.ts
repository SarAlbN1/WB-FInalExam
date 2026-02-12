export interface Contrato {
  id?: number;
  identificador: string;
  valor: number;
  nombre_contratante: string;
  documento_contratante: string;
  nombre_contratantista: string;
  documento_contratantista: string;
 fecha_inicial: Date;
fecha_final: Date;
}

export interface Entidad {
  id?: number;
  nit: string;
  nombre: string;
  contratos: Contrato[];
}
