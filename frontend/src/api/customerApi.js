

export const searchCustomer = async (typeId, number) => {
  
  const res = await fetch(
    `http://localhost:8080/api/customers/search?identityDocumentTypeId=${typeId}&identityDocumentNumber=${number}`
  );

  const data = await res.json();

  if (!res.ok) {
    throw new Error(data.message || "Error del servidor");
  }

  return data;
}; 