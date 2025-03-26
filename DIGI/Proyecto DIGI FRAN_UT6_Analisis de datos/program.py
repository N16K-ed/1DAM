

import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

def analizar_ventas(csv_path):
    # Cargar los datos
    df = pd.read_csv(csv_path)
    df["Fecha"] = pd.to_datetime(df["Fecha"])  # Convertir a fecha

    # 1️⃣ Productos más vendidos
    productos_mas_vendidos = df.groupby("Producto")["Cantidad vendida"].sum().sort_values(ascending=False)
    
    # 2️⃣ Días con más ventas
    ventas_por_dia = df.groupby("Fecha")["Cantidad vendida"].sum()
    
    # 3️⃣ Relación entre precio y cantidad vendida
    relacion_precio_cantidad = df.groupby("Precio (€)")["Cantidad vendida"].sum()
    
    # 4️⃣ Método de pago más usado
    metodos_pago = df["Método de pago"].value_counts()
    
    # 5️⃣ Compras de clientes nuevos
    compras_clientes_nuevos = df["Cliente nuevo (Sí/No)"].value_counts()
    
    # 🔹 Visualización de datos
    plt.figure(figsize=(15, 10))
    
    # Productos más vendidos
    plt.subplot(2, 2, 1)
    productos_mas_vendidos.plot(kind="bar", color="royalblue")
    plt.title("Productos más vendidos")
    plt.xlabel("Producto")
    plt.ylabel("Cantidad vendida")
    plt.xticks(rotation=45, ha="right")
    
    # Ventas por día
    plt.subplot(2, 2, 2)
    ventas_por_dia.plot(kind="line", marker="o", color="green")
    plt.title("Ventas por día")
    plt.xlabel("Fecha")
    plt.ylabel("Cantidad vendida")
    
    # Relación entre precio y cantidad vendida (gráfico de dispersión)
    plt.subplot(2, 2, 3)
    sns.scatterplot(x=df["Precio (€)"], y=df["Cantidad vendida"], alpha=0.6, color="red")
    plt.title("Relación entre precio y cantidad vendida")
    plt.xlabel("Precio (€)")
    plt.ylabel("Cantidad vendida")
    
    # Métodos de pago más usados
    plt.subplot(2, 2, 4)
    metodos_pago.plot(kind="bar", color="purple")
    plt.title("Métodos de pago más usados")
    plt.xlabel("Método de pago")
    plt.ylabel("Cantidad de compras")
    
    plt.tight_layout()
    plt.show()
    
    # Mostrar resumen de clientes nuevos
    print("\nCompras de clientes nuevos:")
    print(compras_clientes_nuevos)

# Ejecutar análisis con un archivo CSV (reemplaza con tu archivo)
csv_path = "ventas_tienda_online.csv"  # Ruta del archivo CSV
analizar_ventas(csv_path)
